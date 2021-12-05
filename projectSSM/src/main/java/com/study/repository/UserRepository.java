package com.study.repository;

import com.study.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserRepository {

    @Select("select * from t_user")
    public List<User> findUser();

    @Update("update t_user set userName=#{userName} where userId=#{userId}")
    public int updateUser(User user);

    @Delete("delete from t_user where userId=#{userId}")
    public int deleteUser(User user);

    @Insert("insert into t_user values (null,#{userName},#{password})")
    public int insertUser(User user);
}
