package com.gupaoedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/23 17:22
 */
@Controller
public class UserController {

    @RequestMapping("/show")
    public String showInfo(Model model){
        model.addAttribute("msg","Thymeleaf Hello ....122211");
        return "index";
    }
}
