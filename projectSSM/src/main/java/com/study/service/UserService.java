package com.study.service;

import com.study.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserService {

    public List<User> findUser();

    public int updateUser(User user);

    public int deleteUser(User user);

    public int insertUser(User user);
}
