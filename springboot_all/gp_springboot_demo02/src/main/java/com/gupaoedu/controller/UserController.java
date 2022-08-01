package com.gupaoedu.controller;

import com.gupaoedu.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/20 21:31
 */
@RestController
public class UserController {

    @Value("${user.username}")
    private String userName;

    @Value("${user.age}")
    private Integer age;
    @Value("${user.address}")
    private String address;

    @Autowired
    private User user;


    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot ..." + userName + "  " + age + "  " + address  + "--->" + user;
    }
}
