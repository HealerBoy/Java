package dao;

import bean.IdCard;
import org.apache.ibatis.annotations.Select;

public interface IdCardMapper {
    @Select("select * from idCard where id = #{id}")
    IdCard selectIdCardById(int id);
}
