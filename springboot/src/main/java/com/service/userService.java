package com.service;

import com.jopo.User;
import java.util.List;

public interface userService {

    List<User> query(User user);

    Integer addUser(User user);

    User queryById(Integer id);

    Integer updateUser(User user);

    Integer deleteUser(Integer id);
}
