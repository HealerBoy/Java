package dao.impl;

import dao.UserDao;
//目标类
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }

    @Override
    public boolean login(String name, String password) {
        if(name.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }
}
