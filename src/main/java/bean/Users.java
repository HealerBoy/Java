package bean;

public class Users {
    //基于注解的简单查询
    private int id;             //用户ID
    private String name;        //用户姓名
    private String email;       //用户邮箱
    private String phone;       //用户电话

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
