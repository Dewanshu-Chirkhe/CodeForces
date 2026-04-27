import requests
import os
import re
import sys

BASE_DIR = "."   # current directory

def camel_case(name):
    words = re.split(r'[^a-zA-Z0-9]', name)
    return ''.join(word.capitalize() for word in words if word)

def get_problem_data(problem_id):
    contestId = int(problem_id[:-1])
    index = problem_id[-1]

    url = "https://codeforces.com/api/problemset.problems"
    data = requests.get(url).json()

    for prob in data["result"]["problems"]:
        if prob.get("contestId") == contestId and prob.get("index") == index:
            return prob

    return None

def create_file(problem_id):
    prob = get_problem_data(problem_id)

    if not prob:
        print("Problem not found")
        return

    rating = prob.get("rating", 0)
    name = prob.get("name")

    camel = camel_case(name)
    class_name = f"{camel}_{problem_id}"

    folder = os.path.join(BASE_DIR, str(rating))
    os.makedirs(folder, exist_ok=True)

    filename = f"{class_name}.java"
    path = os.path.join(folder, filename)

    if os.path.exists(path):
        print("File already exists")
        return

    with open(path, "w") as f:
        f.write("import java.util.*;\n\n")
        f.write(f"public class {class_name} {{\n")
        f.write("    public static void main(String[] args) {\n")
        f.write("        Scanner sc = new Scanner(System.in);\n")
        f.write("        int t = sc.nextInt();\n")
        f.write("        while(t-- > 0){\n")
        f.write("            int n = sc.nextInt();\n\n")
        f.write("        }\n")
        f.write("        sc.close();\n")
        f.write("    }\n")
        f.write("}\n")

    print(f"Created: {path}")

if __name__ == "__main__":
    create_file(sys.argv[1])