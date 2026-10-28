
package com.internship.phase3.service;

import com.internship.phase3.dao.StudentDAO;
import com.internship.phase3.model.Student;

import java.sql.SQLException;
import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO = new StudentDAO();

    public void addStudent(Student student) throws SQLException {
        validateStudent(student);

        boolean added = studentDAO.addStudent(student);

        if (added) {
            System.out.println("Student added successfully!");
        }
    }

    public List<Student> getAllStudents() throws SQLException {
        return studentDAO.getAllStudents();
    }

    public Student getStudentById(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Student ID must be positive.");
        }

        return studentDAO.getStudentById(id);
    }

    public void updateStudent(Student student) throws SQLException {
        if (student.getId() <= 0) {
            throw new IllegalArgumentException("Student ID must be positive.");
        }

        validateStudent(student);

        boolean updated = studentDAO.updateStudent(student);

        if (updated) {
            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    public void deleteStudent(int id) throws SQLException {
        if (id <= 0) {
            throw new IllegalArgumentException("Student ID must be positive.");
        }

        boolean deleted = studentDAO.deleteStudent(id);

        if (deleted) {
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void validateStudent(Student student) {
        if (student.getName() == null || student.getName().isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (student.getAge() < 1 || student.getAge() > 120) {
            throw new IllegalArgumentException("Age must be between 1 and 120.");
        }

        if (student.getEmail() == null ||
                !student.getEmail().matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$")) {
            throw new IllegalArgumentException("Please enter a valid email.");
        }

        if (student.getCourse() == null || student.getCourse().isBlank()) {
            throw new IllegalArgumentException("Course cannot be empty.");
        }
    }
}
