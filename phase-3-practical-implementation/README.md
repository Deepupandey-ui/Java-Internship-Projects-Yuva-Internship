# Phase 3: Practical Implementation Project

## 1. Overview

This project is part of Phase 3 of the Yuva Internship program. It implements a console-based Student Management System using Java, JDBC, and MySQL.

The application demonstrates database connectivity, CRUD operations, input validation, and separation of responsibilities across different application layers.

## 2. Objectives

- Apply Java and object-oriented programming concepts.
- Connect a Java application to a MySQL database.
- Implement database-backed CRUD operations.
- Use prepared statements for SQL operations.
- Organize code using a layered architecture.
- Manage dependencies with Maven.
- Keep database credentials outside the source code.

## 3. Technologies and Tools

- Java
- Maven
- MySQL
- JDBC
- MySQL Connector/J
- Git and GitHub
- Windows PowerShell

## 4. Features

- Add student records
- View all students
- Search for a student by ID
- Update student information
- Delete student records
- Validate student details
- Handle database errors and duplicate email addresses

## 5. Project Structure

```text
phase-3-practical-implementation/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    └── main/
        └── java/
            └── com/
                └── internship/
                    └── phase3/
                        ├── Main.java
                        ├── dao/
                        │   └── StudentDAO.java
                        ├── database/
                        │   └── DatabaseConnection.java
                        ├── model/
                        │   └── Student.java
                        └── service/
                            └── StudentService.java
```

## 6. Application Architecture

- **Main:** Provides the menu-driven console interface.
- **Model:** Represents student data.
- **DAO:** Executes SQL queries using JDBC.
- **Service:** Coordinates application operations and validation.
- **DatabaseConnection:** Establishes connections to MySQL.

## 7. Prerequisites

Install a compatible JDK, Maven, and MySQL Server.

Verify Java and Maven:

```powershell
java -version
javac -version
mvn -version
```

Ensure the MySQL server is running before launching the application.

## 8. Database Setup

Create the database:

```sql
CREATE DATABASE student_management;
```

Select it:

```sql
USE student_management;
```

Create the students table:

```sql
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    course VARCHAR(100) NOT NULL
);
```

If the database and table already exist, verify their structure instead of recreating them.

## 9. Database Configuration

The application reads database credentials from these environment variables:

- `DB_USER`
- `DB_PASSWORD`

In Windows PowerShell, set them for the current session:

```powershell
$env:DB_USER = "root"
$securePassword = Read-Host "Enter your MySQL password" -AsSecureString
$env:DB_PASSWORD = [System.Net.NetworkCredential]::new("", $securePassword).Password
Remove-Variable securePassword
```

Use the appropriate MySQL username for your environment. Never commit database passwords or other secrets to GitHub.

## 10. Build and Run

Open PowerShell in the Phase 3 project directory.

Compile the application:

```powershell
mvn clean compile
```

Launch the console application:

```powershell
mvn exec:java '-Dexec.mainClass=com.internship.phase3.Main'
```

The project must have the Maven Exec Plugin available for the run command. If necessary, configure the plugin explicitly in `pom.xml`.

Maven manages the MySQL Connector/J dependency declared in the project configuration, so a manually downloaded connector JAR is not required.

## 11. Testing Checklist

- [ ] Launch the application with valid database configuration.
- [ ] Add a student with valid details.
- [ ] View all student records.
- [ ] Search for an existing student.
- [ ] Search for a non-existent student.
- [ ] Update a student record.
- [ ] Delete a test record.
- [ ] Attempt to add a duplicate email address.
- [ ] Test invalid input and database error handling.
- [ ] Confirm that database records persist after restarting the application.

Record actual results and document any known limitations.

## 12. Security Considerations

- Keep database credentials outside Java source files.
- Exclude compiled output and local secret files using `.gitignore`.
- Use prepared statements for database operations.
- Avoid committing local credentials or unnecessary downloaded binaries.

## 13. Learning Outcomes

This phase demonstrates practical experience with JDBC, relational database operations, Maven dependency management, layered application design, input validation, and database configuration.

## 14. Conclusion

The project applies Java programming concepts to a database-backed application. It provides a foundation for subsequent work involving testing, quality assurance, deployment, and production readiness.

## Author

Deepu Pandey
