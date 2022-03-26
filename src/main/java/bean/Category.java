package bean;

import java.util.List;
//一对多查询
public class Category {
    private int cid;                    //类别ID
    private String typeName;            //类别名称
    private List<Product> productList;  //关联商品表

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
