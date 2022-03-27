package dao;

import bean.Category;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface CategoryMapper {
    @Select("select * from category where cid = #{cid}")
    @Results({@Result(id = true ,column = "cid" , property = "cid"),
            @Result(column = "typeName" , property = "typeName"),
            @Result(column = "cid",property = "productList" , many = @Many(select = "dao.ProductMapper.selectProductByCategoryId"))
    })
    Category selectCategoryById(int cid);
}
