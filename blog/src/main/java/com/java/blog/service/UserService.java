package com.java.blog.service;

import com.java.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
