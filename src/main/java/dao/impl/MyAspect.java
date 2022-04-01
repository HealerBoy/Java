package dao.impl;

public class MyAspect {
    //切面类
    public void check_Permissions(){
        System.out.println("模拟检查权限......");
    }
    public void log(){
        System.out.println("模拟记录日志......");
    }
}
