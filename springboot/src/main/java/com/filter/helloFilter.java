package com.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(urlPatterns = "/Servlet1hello")
public class HelloFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("---------initFilter---------");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("________servlet1hello过滤器执行之前_________");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("________servlet1hello过滤器执行之后_________");
    }

    @Override
    public void destroy() {
        System.out.println("----------destroyFilter-----------");
    }
}
