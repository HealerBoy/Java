package dao;

import bean.Student;

import java.io.IOException;
import java.util.List;

public interface IStudent {
    List<Student> findAll() throws IOException;
    Student getStudents(int id) throws IOException;
    void insertStudent(Student student) throws IOException;
    void deleteStudentById(int id) throws IOException;
    void UpdateStudent(Student student) throws IOException;
    List<Student> selectByNameAndAge(Student student) throws IOException;
}