package com.java.blog.service.serviceImpl;

import com.java.blog.dao.UserRepository;
import com.java.blog.po.User;
import com.java.blog.service.UserService;
import com.java.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        //System.out.println(password + " , " + MD5Utils.code(password)+" , " + MD5Utils.code("123456"));
        //System.out.println(user.getUsername()+","+user.getPassword());
        return user;
    }
}
