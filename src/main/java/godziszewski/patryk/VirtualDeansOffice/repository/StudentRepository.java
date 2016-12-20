package godziszewski.patryk.VirtualDeansOffice.repository;

import java.util.List;

import godziszewski.patryk.VirtualDeansOffice.model.Student;

/**
 * Created by Patryk on 2016-12-20.
 */
public interface StudentRepository {
    Student getStudentByUsername(String username);
    List<Student> getAllStudents();
    List<Student> getStudentsByMajor(String major);
    void addStudent(Student student);
}