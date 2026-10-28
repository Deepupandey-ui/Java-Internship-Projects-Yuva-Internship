package com.internship.phase2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        boolean running = true;

        while (running) {

            System.out.println("\n====================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("====================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("====================================");

            try {

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {

                    case 1:

                        System.out.print("Enter Student ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Student Name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter Student Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter Student Course: ");
                        String course = scanner.nextLine();

                        Student student =
                                new Student(id, name, age, course);

                        manager.addStudent(student);

                        break;

                    case 2:

                        manager.viewStudents();

                        break;

                    case 3:

                        System.out.print("Enter Student ID to search: ");
                        int searchId = scanner.nextInt();

                        Student foundStudent =
                                manager.searchStudent(searchId);

                        if (foundStudent != null) {

                            System.out.println("\nStudent Found:");
                            foundStudent.displayStudent();

                        } else {

                            System.out.println("Student not found.");
                        }

                        break;

                    case 4:

                        System.out.print("Enter Student ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = scanner.nextLine();

                        System.out.print("Enter New Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Enter New Course: ");
                        String newCourse = scanner.nextLine();

                        manager.updateStudent(
                                updateId,
                                newName,
                                newAge,
                                newCourse
                        );

                        break;

                    case 5:

                        System.out.print("Enter Student ID to delete: ");
                        int deleteId = scanner.nextInt();

                        manager.deleteStudent(deleteId);

                        break;

                    case 6:

                        running = false;
                        System.out.println(
                                "Thank you for using the system."
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid choice. Please try again."
                        );
                }

            } catch (Exception e) {

                System.out.println(
                        "Invalid input. Please enter valid information."
                );

                scanner.nextLine();
            }
        }

        scanner.close();
    }
}