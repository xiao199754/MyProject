package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {

    @RequestMapping("/hello2")
    public String hello2(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(new User("zhangsan0","18","上海1"));
        userList.add(new User("zhangsan1","19","北京"));
        userList.add(new User("zhangsan2","17","天津"));
        model.addAttribute("list",userList);
        return "user";
    }
}
