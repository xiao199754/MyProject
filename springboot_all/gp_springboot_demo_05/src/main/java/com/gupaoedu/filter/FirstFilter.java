package com.gupaoedu.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/23 14:58
 */
@WebFilter(urlPatterns = "/first")
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("----init----");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("________First过滤器执行之前_________");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("________First过滤器执行之后_________");
    }

    @Override
    public void destroy() {
        System.out.println("****destroy****");
    }
}
