package dao;

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
}
