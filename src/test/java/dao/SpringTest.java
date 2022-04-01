package dao;

import dao.impl.MyProxy;
import dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class SpringTest {
    @Test
    public void springTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) applicationContext.getBean("userService");
        boolean flag=userService.login("admin","admin");
        if(flag){
            System.out.println("登陆成功！");
        }else{
            System.out.println("登陆失败！");
        }
    }
    @Test
    public void JDKTest(){
        MyProxy myProxy=new MyProxy();
        UserDao userDao=new UserDaoImpl();
        UserDao userDao1=(UserDao) myProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}