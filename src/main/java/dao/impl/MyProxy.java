package dao.impl;
import dao.UserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//代理类
public class MyProxy implements InvocationHandler {
    //声明目标类接口
    private UserDao userDao;
    public Object createProxy(UserDao userDao){
        this.userDao=userDao;
        //类加载器
        ClassLoader classLoader=MyProxy.class.getClassLoader();
        //被代理对象实现的所有接口
        Class[] classes=userDao.getClass().getInterfaces();
        //使用代理对象增强，返回代理对象
        return Proxy.newProxyInstance(classLoader,classes,this);
    }
    /*
    * 所有动态代理类的方法调用，都会交给invoke()方法去处理
    * proxy被代理的对象
    * method将要被执行的方法信息（反射）
    * args执行方法时需要的参数
    * */

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //创建切面对象
        MyAspect myAspect=new MyAspect();
        //前增强
        myAspect.check_Permissions();
        //在目标类上调用方法，并传入参数
        Object obj = method.invoke(userDao,args);
        //后增强
        myAspect.log();
        return obj;
    }
}
