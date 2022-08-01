package com.gupaoedu.controller;

import com.gupaoedu.pojo.User;
import com.gupaoedu.service.IUserService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 17:49
 */
@Controller
public class UserController {

    @Autowired
    private IUserService service;



    @RequiresRoles(value = {"role1"})
    @RequestMapping("/user/query")
    public String query(Model model){
        model.addAttribute("list",service.query(null));
        return "user";
    }
    @RequiresRoles(value = {"role2"})
    @RequestMapping("/user/query1")
    public String query1(Model model){
        model.addAttribute("list",service.query(null));
        return "user";
    }

/*    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("123456","aaa",1024);
        System.out.println(md5Hash);
    }*/
}
