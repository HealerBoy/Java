package dao.impl;

import dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean login(String name, String password) {
        if(name.equals("admin") && password.equals("admin")){
            return true;
        }
        return false;
    }
}
