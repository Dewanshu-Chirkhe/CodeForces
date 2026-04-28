import requests
import time
import os
import sys

HANDLE = "Dewanshu-Chirkhe"
BASE_DIR = "."

SEEN_FILE = "seen_submissions.txt"
SOLVED_FILE = "solved_problems.txt"


# -------------------------------
# Load & Save Helpers
# -------------------------------

def load_set(file):
    if not os.path.exists(file):
        return set()
    with open(file, "r") as f:
        return set(line.strip() for line in f)

def save_set(file, data):
    with open(file, "w") as f:
        for item in sorted(data):
            f.write(item + "\n")


# -------------------------------
# Fetch Submissions
# -------------------------------

def get_recent_submissions():
    url = f"https://codeforces.com/api/user.status?handle={HANDLE}&from=1&count=20"
    response = requests.get(url)

    if response.status_code != 200:
        print("Failed to fetch submissions")
        return []

    return response.json().get("result", [])


# -------------------------------
# Find File
# -------------------------------

def find_file(problem_id):
    for folder in os.listdir(BASE_DIR):
        if not folder.isdigit():
            continue

        folder_path = os.path.join(BASE_DIR, folder)

        if not os.path.isdir(folder_path):
            continue

        for file in os.listdir(folder_path):
            if file.endswith(".java") and problem_id in file:
                return os.path.join(folder_path, file)

    return None


# -------------------------------
# Batch Push
# -------------------------------

def push_batch(problem_ids, file_paths):
    print("Batch pushing to GitHub...")

    for path in file_paths:
        if os.system(f'git add "{path}"') != 0:
            print(f"Failed to add {path}")
            return False

    # Add state files too
    if os.system('git add seen_submissions.txt solved_problems.txt') != 0:
        print("Failed to add state files")
        return False

    msg = "Codeforces: " + ", ".join(problem_ids)

    if os.system(f'git commit -m "{msg}"') != 0:
        print("Commit failed (maybe nothing to commit)")
        return False

    if os.system("git push") != 0:
        print("Push failed")
        return False

    return True


# -------------------------------
# Core Logic
# -------------------------------

def process_submissions():
    seen = load_set(SEEN_FILE)
    solved = load_set(SOLVED_FILE)

    subs = get_recent_submissions()

    new_problem_ids = []
    new_files = []

    pending_seen = set()
    pending_solved = set()

    for sub in reversed(subs):
        sub_id = str(sub["id"])

        if sub_id in seen:
            continue

        # Handle accepted submissions
        if sub.get("verdict") == "OK":
            contestId = sub["problem"]["contestId"]
            index = sub["problem"]["index"]
            problem_id = f"{contestId}{index}"

            if problem_id in solved:
                pending_seen.add(sub_id)
                continue

            file_path = find_file(problem_id)

            if file_path:
                print(f"Accepted: {problem_id}")
                new_problem_ids.append(problem_id)
                new_files.append(file_path)

                pending_seen.add(sub_id)
                pending_solved.add(problem_id)
            else:
                print(f"File not found for {problem_id}")

        else:
            # Non-OK submissions are safe to mark as seen
            pending_seen.add(sub_id)

    # If nothing new, exit early
    if not new_files:
        print("No new accepted submissions.")
        return

    # Try pushing to GitHub
    success = push_batch(new_problem_ids, new_files)

    if success:
        print("Push successful. Updating state files...")

        seen.update(pending_seen)
        solved.update(pending_solved)

        save_set(SEEN_FILE, seen)
        save_set(SOLVED_FILE, solved)
    else:
        print("Push failed. Will retry in next cycle.")


# -------------------------------
# Modes
# -------------------------------

def run_once():
    print("Running once...")
    process_submissions()

def watch():
    print("Watching submissions...")
    while True:
        process_submissions()
        time.sleep(10)


# -------------------------------
# Entry Point
# -------------------------------

if __name__ == "__main__":
    if len(sys.argv) > 1 and sys.argv[1] == "run-once":
        run_once()
    else:
        watch()