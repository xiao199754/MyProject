package com.gupaoedu.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 16:17
 */
@Component
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    /**
     * 自定义的全局异常
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest
            , HttpServletResponse httpServletResponse
            , Object o, Exception e) {
        System.out.println("全局的自定义异常处理触发了....");
        ModelAndView mv = new ModelAndView();
        if(e instanceof  NullPointerException){
            mv.setViewName("error1");
            mv.addObject("error","空指针异常");
        }else if(e instanceof  ArithmeticException){
            mv.setViewName("error2");
            mv.addObject("error","算数异常");
        }
        return mv;
    }
}
