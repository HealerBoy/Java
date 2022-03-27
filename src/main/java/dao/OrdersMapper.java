package dao;

import bean.Orders;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface OrdersMapper {
    @Select("select * from orders where id=#{id}")
    @Results({@Result(id = true , column = "id" , property = "id"),
            @Result(column = "number", property = "number"),
            @Result(column = "id" , property = "productList" , many = @Many( select = "dao.ProductMapper.selectProductByOrdersId"))
    })
    Orders selectOrdersById(int id);
}
