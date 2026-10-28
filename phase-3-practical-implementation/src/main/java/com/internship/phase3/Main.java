
package com.internship.phase3;

import com.internship.phase3.model.Student;
import com.internship.phase3.service.StudentService;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final StudentService service = new StudentService();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine().trim();

            try {
                switch (choice) {
                    case "1":
                        addStudent();
                        break;
                    case "2":
                        viewStudents();
                        break;
                    case "3":
                        searchStudent();
                        break;
                    case "4":
                        updateStudent();
                        break;
                    case "5":
                        deleteStudent();
                        break;
                    case "6":
                        running = false;
                        System.out.println("Thank you for using the system.");
                        break;
                    default:
                        System.out.println("Invalid choice. Enter 1 to 6.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Validation error: " + e.getMessage());
            } catch (SQLException e) {
                if (e.getErrorCode() == 1062) {
                    System.out.println("This email is already registered.");
                } else {
                    System.out.println("Database error: " + e.getMessage());
                }
            }
        }

        scanner.close();
    }

    private static void addStudent() throws SQLException {
        String name = readText("Enter name: ");
        int age = readInt("Enter age: ");
        String email = readText("Enter email: ");
        String course = readText("Enter course: ");

        service.addStudent(new Student(name, age, email, course));
    }

    private static void viewStudents() throws SQLException {
        List<Student> students = service.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.display();
            System.out.println("------------------------------------");
        }
    }

    private static void searchStudent() throws SQLException {
        int id = readInt("Enter student ID: ");
        Student student = service.getStudentById(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            student.display();
        }
    }


private static void updateStudent() throws SQLException {
    int id = readInt("Enter student ID to update: ");

    Student existing = service.getStudentById(id);

    if (existing == null) {
        System.out.println("Student not found.");
        return;
    }

    String name = readText("Enter new name: ");
    int age = readInt("Enter new age: ");
    String email = readText("Enter new email: ");
    String course = readText("Enter new course: ");

    service.updateStudent(
            new Student(id, name, age, email, course)
    );

    }

    private static void deleteStudent() throws SQLException {
        int id = readInt("Enter student ID to delete: ");

        System.out.print("Confirm deletion (yes/no): ");
        String answer = scanner.nextLine().trim();

        if (answer.equalsIgnoreCase("yes")) {
            service.deleteStudent(id);
        } else {
            System.out.println("Deletion cancelled.");
        }
    }

    private static String readText(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Enter a valid whole number.");
        }
    }
}
