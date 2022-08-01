package com.gupaoedu.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/23 15:03
 */
public class SecondFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("--second--init----");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("________Second过滤器执行之前_________");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("________Second过滤器执行之后_________");
    }

    @Override
    public void destroy() {
        System.out.println("****destroy****");
    }
}
