package com.mapper;


import com.jopo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from t_user")
    List<User> query(User user);

    @Insert("insert into t_user (userName,password) values (#{userName},#{password})")
    Integer addUser(User user);

    @Select("select * from t_user where userId=#{userId}")
    User queryById(Integer id);

    @Update("update t_user set userName=#{userName},password=#{password} where userId=#{userId}")
    Integer updateUser(User user);

    @Delete("delete from t_user where userId=#{userId}")
    Integer deleteUser(Integer id);
}
