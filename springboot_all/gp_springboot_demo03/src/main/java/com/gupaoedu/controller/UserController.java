package com.gupaoedu.controller;

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

    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot ...maven";
    }
}
