package com.gupaoedu.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 16:06
 */
@ControllerAdvice
public class GlobalException {
    /**
     * 如果当前类中出现了NullPointerException异常就会跳转到本方法对应的view中
     * @return
     */
    //@ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("error",e.toString());
        view.setViewName("error1");
        return view;
    }

    /**
     * 如果当前类中出现了ArithmeticException异常就会跳转到本方法对应的view中
     * @return
     */
    //@ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("error",e.toString());
        view.setViewName("error2");
        return view;
    }
}
