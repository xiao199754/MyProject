package com.gupaoedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.Null;

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

    @RequestMapping("/show1")
    public String showInfo1(){
        String msg = null;
        msg.length(); // NullPointerException
        return "success";
    }

    /**
     * 如果当前类中出现了NullPointerException异常就会跳转到本方法对应的view中
     * @return
     */
    /*@ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("error",e.toString());
        view.setViewName("error1");
        return view;
    }*/

    /**
     * 如果当前类中出现了ArithmeticException异常就会跳转到本方法对应的view中
     * @return
     */
    /*@ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("error",e.toString());
        view.setViewName("error2");
        return view;
    }*/

    @RequestMapping("/show2")
    public String showInfo2(){
        int i = 0;
        int b = 100;
        System.out.println(b/i); // ArithmeicExpetion
        return "success";
    }

}
