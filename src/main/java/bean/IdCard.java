package bean;

public class IdCard {
    //一对一查询
    private int id;         //身份证ID
    private String code;    //身份证号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
