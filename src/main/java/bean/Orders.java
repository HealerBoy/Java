package bean;

import java.util.List;
//多对多查询
public class Orders {
    private int id;                     //订单ID
    private String number;              //订单号
    private List<Product> productList;  //关联商品表
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
