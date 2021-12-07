package com.controller;


import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
