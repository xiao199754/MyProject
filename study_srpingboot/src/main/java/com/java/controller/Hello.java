package com.java.controller;

import com.java.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class Hello {

    @Value("${user.id}")
    private Integer id;

    @Value("${user.username}")
    private String username;

    @Value("${user.address}")
    private String address;

    @Autowired
    private User user;

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring-boot....  "+id+"-"+username+"-"+address+"====>"+user;
    }
}
