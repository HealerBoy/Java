package dao;

import bean.Product;

import java.util.List;

public interface IProduct {
    //一对多的查询，返回一个List
    List<Product> findCategoryWithProduct(int id);
    //多对多的查询，返回一个List
    List<Product> findOrdersWithProduct(int id);
}
