# Phase 2: Core Java Concepts and Skills

## 1. Overview

This project is part of Phase 2 of the Yuva Internship program. It demonstrates core Java programming concepts through a console-based Student Management System.

The application stores student records in memory and allows users to perform common student-management operations through a menu-driven interface.

## 2. Objectives

- Apply object-oriented programming concepts.
- Practice conditional statements, loops, methods, and classes.
- Manage collections using `ArrayList`.
- Implement basic CRUD operations.
- Handle invalid menu input.
- Organize Java code into separate classes.

## 3. Technologies and Tools

- Java
- JDK 17 or later
- Git
- GitHub
- Windows PowerShell or another Java-compatible terminal

## 4. Features

- Add a student
- View all students
- Search for a student by ID
- Update student information
- Delete a student
- Handle invalid menu input
- Exit the application

Student records are stored in memory using an `ArrayList`. Records are not persisted after the application terminates.

## 5. Core Java Concepts

The project demonstrates:

- Variables and data types
- Operators and conditional statements
- `switch` statements
- Loops
- Methods
- Classes and objects
- Constructors
- Encapsulation
- Getters and setters
- `ArrayList`
- Exception handling

## 6. Project Structure

```text
phase-2-core-java-concepts-and-skills/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── internship/
│                   └── phase2/
│                       ├── Main.java
│                       ├── Student.java
│                       └── StudentManager.java
├── .gitignore
└── README.md
```

## 7. Prerequisites

Install a compatible JDK and verify the installation:

```powershell
java -version
javac -version
```

## 8. Compile and Run

Run the following commands from the Phase 2 project directory:

```powershell
javac -d out src\main\java\com\internship\phase2\Main.java src\main\java\com\internship\phase2\Student.java src\main\java\com\internship\phase2\StudentManager.java
java -cp out com.internship.phase2.Main
```

The application should display a menu for managing student records.

## 9. Testing Checklist

Manually verify the following operations:

- [ ] Add a student with valid details.
- [ ] View the student in the list.
- [ ] Search using an existing student ID.
- [ ] Search using a non-existent ID.
- [ ] Update an existing student.
- [ ] Delete a student.
- [ ] Enter invalid menu input.
- [ ] Exit the application.

Record the actual results before marking these tests as completed.

## 10. Learning Outcomes

This project provides practical experience with object-oriented programming, collections, methods, menu-driven applications, input handling, and basic CRUD logic.

## 11. Conclusion

Phase 2 builds on the initial Java setup by applying core language concepts to a practical console application. It prepares the foundation for database-backed implementation in the next phase.

## Author

Deepu Pandey
