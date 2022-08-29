package com.controller;

import com.jopo.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserControllerMybatis {

    @Autowired
    UserService userService;

    /*基础页面的请求,请求什么就返回什么页面*/
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

    @RequestMapping("/user/query")
    public String query(Model model){
        model.addAttribute("list1",userService.query(null));
        return "user";
    }

    @RequestMapping("/user/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:/user/query";
    }

    @RequestMapping("/user/queryById")
    public String queryById(Integer userId,Model model){
        User user = userService.queryById(userId);
        model.addAttribute("list2",user);

        System.out.println(user);

        return "userUpdate";
    }

    @RequestMapping("/user/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:/user/query";
    }

    @RequestMapping("/user/deleteUser")
    public String deleteUser(Integer userId){
        userService.deleteUser(userId);
        return "redirect:/user/query";
    }

}
