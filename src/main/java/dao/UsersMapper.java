package dao;

import bean.Users;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UsersMapper {
    @Select("select * from users where id = #{id}")
    Users selectUsers(int id);
    @Insert("insert into users (id,name,email,phone)"+"values(#{id},#{name},#{email},#{phone})")
    int insertUsers(Users users);
    @Update("update users set name=#{name},email=#{email},phone=#{phone}"+"where id =#{id}")
    int updateUsers(Users users);
    @Delete("delete from users where id=#{id}")
    int deleteUsers(int id);
}