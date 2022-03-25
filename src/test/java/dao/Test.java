package dao;
import bean.*;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import utils.MybatisUtils;
import java.util.List;

//junit测试
public class Test {
    private static Logger logger= Logger.getLogger(String.valueOf(Test.class));
    /*
    * 简单查询
    * */
    @org.junit.Test
    public void StudentTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        sqlSession.delete("deleteStudentById",8);
        sqlSession.close();
    }
    /*
    * 一对一关系查询
    * */
    @org.junit.Test
    public void findPersonByIdTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        Person person = sqlSession.selectOne("findPersonById",1);
        System.out.println(person.getCard());
        sqlSession.close();
    }
    /*
     * 一对多查询
     * */
    @org.junit.Test
    public void findCategoryWithProductTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        List<Product> productList=sqlSession.selectList("findCategoryWithProduct",1);
        System.out.println(productList);
        sqlSession.close();
    }
    /*
    * 多对多查询
    * */
    @org.junit.Test
    public void findOrdersWithProductTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        List<Orders> ordersList=sqlSession.selectList("findOrdersWithProduct",1);
        System.out.println(ordersList);
        sqlSession.close();
    }
}