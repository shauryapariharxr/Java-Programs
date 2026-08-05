# ☕ Java Programming

A collection of Java programs created while learning Java fundamentals. This repository is organized by topic to keep the source code clean and easy to navigate.

---

# 📁 Project Structure

```
JAVA_PROJECTS/
│
├── .vscode/
│   ├── settings.json
│   └── tasks.json
│
├── bin/
│   └── (Compiled .class files)
│
├── src/
│   ├── basic/
│   ├── operators/
│   ├── conditionals/
│   ├── loops/
│   ├── functions/
│   ├── arrays/
│   ├── strings/
│   ├── oop/
│   └── projects/
│
├── .gitignore
└── README.md
```

---

# 📂 Folder Description

| Folder | Purpose |
|---------|---------|
| `src/` | Contains all Java source code (`.java`) |
| `bin/` | Contains compiled Java bytecode (`.class`) |
| `.vscode/` | VS Code configuration files |
| `.gitignore` | Prevents unnecessary files from being uploaded to GitHub |

---

# ⚙️ VS Code Configuration

This project uses a custom **tasks.json** file to compile Java programs into the **bin** folder instead of generating `.class` files inside `src`.

Benefits:

- Keeps the source folder clean
- Separates source code and compiled files
- Follows standard Java project structure

---

# ▶️ Running a Program

1. Open any Java file inside the `src` folder.
2. Press:

```
Ctrl + Shift + B
```

3. Select:

```
Build and Run Java
```

The task will:

- Compile the current Java file.
- Store the `.class` file inside `bin/`.
- Run the program.

---

# 🛠 tasks.json

The project uses a custom build task.

Example:

```json
{
    "version": "2.0.0",
    "tasks": [
        {
            "label": "Build and Run Java",
            "type": "process",
            "command": "cmd.exe",
            "args": [
                "/c",
                "javac -d \"${workspaceFolder}\\bin\" \"${file}\" && java -cp \"${workspaceFolder}\\bin\" ${fileBasenameNoExtension}"
            ],
            "group": {
                "kind": "build",
                "isDefault": true
            },
            "problemMatcher": [
                "$javac"
            ]
        }
    ]
}
```

---

# 📌 Why use a custom task?

By default, Java creates `.class` files next to the source file.

Example:

```
src/
├── HelloWorld.java
├── HelloWorld.class ❌
```

This repository avoids that by compiling into the `bin` folder.

Correct structure:

```
src/
└── HelloWorld.java

bin/
└── HelloWorld.class
```

---

# 🚫 .gitignore

The repository ignores compiled files.

```gitignore
bin/
*.class
```

This keeps the Git repository clean by uploading only source code.

---

# 🧠 Topics Covered

- Java Basics
- Variables
- Data Types
- Operators
- Input & Output
- If-Else
- Switch
- Loops
- Functions
- Arrays
- Strings
- OOP (Coming Soon)
- Mini Projects

---

# 💻 Requirements

- JDK 17 or later
- Visual Studio Code
- Extension Pack for Java

---

# 🚀 Future Plans

- Object-Oriented Programming
- Exception Handling
- File Handling
- Collections Framework
- Multithreading
- JDBC
- Mini Projects

---

## ⭐ If you find this repository useful, consider giving it a star!
