package com.study.controller;

import com.study.entity.User;
import com.study.repository.UserRepository;
import com.study.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public ModelAndView findUser(){
        List<User> userList = userService.findUser();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",userList);
        modelAndView.setViewName("index");


        return modelAndView;
    }

    @RequestMapping(value = "updateUser",produces = "text/html;charset=UTF-8",params = "userId")
    public String updateUser(User user){

        userService.updateUser(user);
        return "redirect:/user/findUser";
    }

    @RequestMapping(value = "deleteUser",produces = "text/html;charset=UTF-8")
    public String deleteUser(User user){

        userService.deleteUser(user);
        return "redirect:/user/findUser";
    }


    @RequestMapping(value = "insertUser",produces = "text/html;charset=UTF-8")
    public String insertUser(User user){

        userService.insertUser(user);
        return "redirect:/user/findUser";
    }


}
