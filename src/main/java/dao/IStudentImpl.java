package dao;

import bean.Student;
import org.apache.ibatis.session.SqlSession;
import utils.MybatisUtils;
import java.io.IOException;
import java.util.List;

//基本的增删改查
public class IStudentImpl implements IStudent{
    MybatisUtils mybatisUtils =null;
    SqlSession sqlSession=null;
    {
        mybatisUtils = new MybatisUtils();
    }
    @Override
    //查找所有信息，并返回一个StudentList
    public List<Student> findAll() throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        List<Student> studentList=sqlSession.selectList("findAll");
        try {
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return studentList;
    }

    @Override
    //通过ID查询信息，并返回
    public Student getStudents(int id) throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        Student student=sqlSession.selectOne("getStudents",id);
        try {
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
        return student;
    }

    @Override
    //添加数据
    public void insertStudent(Student student) throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        int rows=sqlSession.insert("insertStudent",student);
        if(rows>0){
            System.out.println("数据插入成功！");
        }else{
            System.out.println("数据插入失败!");
        }
        try {
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    //通过ID删除信息
    public void deleteStudentById(int id) throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        int rows=sqlSession.delete("deleteStudentById",id);
        if(rows>0){
            System.out.println("数据删除成功！");
        }else{
            System.out.println("数据删除失败!");
        }
        try {
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    //修改数据
    public void UpdateStudent(Student student) throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        int rows=sqlSession.update("deleteStudentById",student);
        if(rows>0){
            System.out.println("数据修改成功！");
        }else{
            System.out.println("数据修改失败!");
        }
        try {
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    @Override
    public List<Student> selectByNameAndAge(Student student) throws IOException {
        sqlSession= MybatisUtils.getSqlSession();
        List<Student> student1=sqlSession.selectList("selectByNameAndAge",student);
        return student1;
    }
}
