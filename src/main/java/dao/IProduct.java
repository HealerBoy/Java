package dao;

import bean.Product;

import java.util.List;

public interface IProduct {
    List<Product> findCategoryWithProduct(int id);
    List<Product> findOrdersWithProduct(int id);
}
