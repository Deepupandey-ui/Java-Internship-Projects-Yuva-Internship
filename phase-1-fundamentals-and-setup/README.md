# Phase 1: Fundamentals and Setup

## 1. Overview

This project is part of Phase 1 of the Yuva Internship program. It demonstrates the setup of a Java development environment, the structure of a basic Java application, and the process of compiling and running a program from the command line.

## 2. Objectives

- Verify the Java Development Kit (JDK) installation.
- Create and execute a basic Java program.
- Follow Java package-naming conventions.
- Organize source code in a structured directory.
- Document the project and its execution steps.
- Understand the fundamentals of Git and GitHub.

## 3. Technologies and Tools

- Java
- JDK 17 or later
- Git
- GitHub
- Windows PowerShell or another terminal
- A Java-compatible code editor or IDE

## 4. Project Structure

```text
phase-1-fundamentals-and-setup/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── internship/
│                   └── phase1/
│                       └── Main.java
├── .gitignore
└── README.md
```

## 5. Application Details

The application contains a `Main` class with the `main()` method as its entry point. It prints messages confirming that the basic Java program executes successfully.

## 6. Prerequisites

Install a compatible JDK and Git.

Verify the Java installation:

```powershell
java -version
javac -version
```

Verify Git:

```powershell
git --version
```

## 7. Compile and Run

Run these commands from the Phase 1 project directory:

```powershell
javac -d out src\main\java\com\internship\phase1\Main.java
java -cp out com.internship.phase1.Main
```

Expected output:

```text
Hello World!
Phase 1 - Fundamentals and Setup
Java development environment is configured successfully.
```

The `-d out` option places compiled class files in the `out` directory.

## 8. Version Control

Git can be used to track changes to the project.

Useful commands:

```powershell
git status
git add .
git commit -m "Complete Phase 1 Java setup"
```

Run Git commands from the intended repository root. Create and configure the GitHub remote only after confirming the repository structure.

## 9. Learning Outcomes

This phase provides practical experience with:

- JDK verification
- Java source files and packages
- Compiling and running Java applications
- Organizing a small project
- Writing project documentation
- Basic Git commands and version-control concepts

## 10. Conclusion

Phase 1 establishes the foundation for subsequent internship work by demonstrating a working Java program and documenting the basic development workflow.

## Author

Deepu Pandey
