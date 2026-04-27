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
        for item in data:
            f.write(item + "\n")


# -------------------------------
# Fetch Submissions
# -------------------------------

def get_recent_submissions():
    url = f"https://codeforces.com/api/user.status?handle={HANDLE}&from=1&count=20"
    return requests.get(url).json()["result"]


# -------------------------------
# Find File
# -------------------------------

def find_file(problem_id):
    for folder in os.listdir(BASE_DIR):
        if not folder.isdigit():
            continue

        folder_path = os.path.join(BASE_DIR, folder)

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
        os.system(f'git add "{path}"')

    msg = "Codeforces: " + ", ".join(problem_ids)

    os.system(f'git commit -m "{msg}"')
    os.system("git push")


# -------------------------------
# Core Logic (shared)
# -------------------------------

def process_submissions():
    seen = load_set(SEEN_FILE)
    solved = load_set(SOLVED_FILE)

    subs = get_recent_submissions()

    new_problem_ids = []
    new_files = []

    for sub in reversed(subs):
        sub_id = str(sub["id"])

        if sub_id in seen:
            continue

        seen.add(sub_id)

        if sub["verdict"] == "OK":
            contestId = sub["problem"]["contestId"]
            index = sub["problem"]["index"]
            problem_id = f"{contestId}{index}"

            if problem_id in solved:
                continue

            file_path = find_file(problem_id)

            if file_path:
                print(f"Accepted: {problem_id}")
                new_problem_ids.append(problem_id)
                new_files.append(file_path)
                solved.add(problem_id)
            else:
                print(f"File not found for {problem_id}")

    save_set(SEEN_FILE, seen)
    save_set(SOLVED_FILE, solved)

    if new_files:
        push_batch(new_problem_ids, new_files)
    else:
        print("No new accepted submissions.")


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