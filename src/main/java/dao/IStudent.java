package dao;

import bean.Student;

import java.io.IOException;
import java.util.List;

public interface IStudent {
    //查询全部返回一个List类型的对象
    List<Student> findAll() throws IOException;
    //查询一个返回一个Student对象
    Student getStudents(int id) throws IOException;
    //插入语句
    void insertStudent(Student student) throws IOException;
    //删除语句
    void deleteStudentById(int id) throws IOException;
    //修改语句
    void UpdateStudent(Student student) throws IOException;
    //通过名字和年龄查询返回相关的List对象
    List<Student> selectByNameAndAge(Student student) throws IOException;
}