package dao;
import bean.*;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import utils.MybatisUtils;
import java.util.List;

//junit测试
public class JunitTest {
    /*
    * 简单查询
    * */
    @Test
    public void StudentTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        sqlSession.delete("deleteStudentById",8);
        sqlSession.close();
    }
    /*
    * 一对一关系查询
    * */
    @Test
    public void findPersonByIdTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        Person person = sqlSession.selectOne("findPersonById",1);
        System.out.println(person.getCard());
        sqlSession.close();
    }
    /*
     * 一对多查询
     * */
    @Test
    public void findCategoryWithProductTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        List<Product> productList=sqlSession.selectList("findCategoryWithProduct",1);
        System.out.println(productList);
        sqlSession.close();
    }
    /*
    * 多对多查询
    * */
    @Test
    public void findOrdersWithProductTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        List<Orders> ordersList=sqlSession.selectList("findOrdersWithProduct",1);
        System.out.println(ordersList);
        sqlSession.close();
    }
    /*
    * 基于注解的简单查询
    * */
    @Test
    public void selectUsersTest(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        UsersMapper mapper=sqlSession.getMapper(UsersMapper.class);
        Users users=mapper.selectUsers(4);
        System.out.println(users.getName());
        sqlSession.close();
    }
    /*
     * 基于注解的简单插入
     * */
    @Test
    public void insertUsersTest(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        Users users=new Users();
        users.setId(4);
        users.setName("4444");
        users.setEmail("444444444");
        users.setPhone("44444444");
        UsersMapper mapper=sqlSession.getMapper(UsersMapper.class);
        int result=mapper.insertUsers(users);
        if(result > 0){
            System.out.println("数据插入成功！");
        }else{
            System.out.println("数据插入失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    /*
     * 基于注解的简单修改
     * */
    @Test
    public void updateUsersTest(){
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        Users users=new Users();
        users.setId(4);
        users.setName("5555555");
        users.setEmail("5555555");
        users.setPhone("555555");
        UsersMapper mapper=sqlSession.getMapper(UsersMapper.class);
        int result = mapper.updateUsers(users);
        if(result > 0){
            System.out.println("数据修改成功！");
        }else{
            System.out.println("数据修改失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    /*
     * 基于注解的简单删除
     * */
    @Test
    public void deleteUsersTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UsersMapper mapper=sqlSession.getMapper(UsersMapper.class);
        int result=mapper.deleteUsers(5);
        if(result > 0){
            System.out.println("数据删除成功！");
        }else{
            System.out.println("数据删除失败！");
        }
        sqlSession.commit();
        sqlSession.close();
    }
    /*
     * 基于注解的一对一查询
     * */
    @Test
    public void selectPersonByIdTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        PersonMapper mapper=sqlSession.getMapper(PersonMapper.class);
        Person person= mapper.selectPersonById(1);
        System.out.println(person.getCard());
        sqlSession.close();
    }
    /*
     * 基于注解的一对多查询
     * */
    @Test
    public void selectCategoryByIdTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        ProductMapper mapper=sqlSession.getMapper(ProductMapper.class);
        List<Product> productList=mapper.selectProductByCategoryId(2);
        for (Product product:productList) {
            System.out.println(product.getGoodsName());
        }
        sqlSession.close();
    }
    /*
     * 基于注解的多对多查询
     * */
    @Test
    public void selectOrdersByIdTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        OrdersMapper mapper=sqlSession.getMapper(OrdersMapper.class);
        Orders orders =mapper.selectOrdersById(1);
        System.out.println(orders);
        sqlSession.close();
    }
}