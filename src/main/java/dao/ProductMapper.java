package dao;

import bean.Product;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductMapper {
    @Select("select * from product where typeId=#{typeId}")
    @Results({@Result( id = true , column = "pid" , property = "pid"),@Result( column = "goodsName" , property = "goodsName"),
    @Result( column = "price" , property = "price")
    })
    List<Product> selectProductByCategoryId(int typeId);
    @Select("select * from product where pid in (select product_id from"+" orders_product where orders_id = #{orders_id})")
    List<Product> selectProductByOrdersId(int orders_id);
}
