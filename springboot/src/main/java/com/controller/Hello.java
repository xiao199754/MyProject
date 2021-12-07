package com.controller;


import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Hello {

    @Value("${user.age}")
    private Integer age;
    @Value("${user.username}")
    private String username;
    @Value("${user.address}")
    private String address;

    @Autowired
    private User user;

    @RequestMapping("/hello")
    public String hello(){
        return "hello springboot ...  "+age+"--"+username+"--"+address+"========>"+user;
    }

}
