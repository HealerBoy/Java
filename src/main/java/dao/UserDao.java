package dao;
//目标接口
public interface UserDao {
    void addUser();
    void deleteUser();
    boolean login(String name, String password);
}
