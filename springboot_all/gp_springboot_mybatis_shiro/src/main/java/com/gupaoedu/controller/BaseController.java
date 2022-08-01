package com.gupaoedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 21:14
 */
@Controller
public class BaseController {

    @RequestMapping("/login")
    public String page(){
        return "login";
    }
}
