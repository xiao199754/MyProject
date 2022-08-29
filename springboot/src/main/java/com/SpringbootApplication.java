package com;

import com.filter.HelloFilter2;
import com.listener.HelloListener2;
import com.servlet.helloServlet2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.*;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.mapper") //用户扫描mapper接口
// 在SpringBoot启动的时候会扫描 @WebServlet @WebFilter @WebListener 注解
@ServletComponentScan()
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);

    }

    //在启动类中显式注册 Servlet
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        // 将要添加的Servlet封装为一个ServletRegistrationBean对象
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new helloServlet2());
        // 设置映射信息
        registrationBean.addUrlMappings("/Servlet2hello");
        return registrationBean;
    }

    //在启动类中显式注册 Filter
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        // 将要添加的Servlet封装为一个 FilterRegistrationBean 对象
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new HelloFilter2());
        // 设置映射信息
        filterRegistrationBean.addUrlPatterns("/Servlet2hello");
        return filterRegistrationBean;
    }

    //在启动类中显式注册 Listener
    @Bean
    public ServletListenerRegistrationBean getListenerRegistrationBean(){
        // 将要添加的Servlet封装为一个 ServletListenerRegistrationBean 对象
        ServletListenerRegistrationBean servletListenerRegistrationBean = new ServletListenerRegistrationBean(new HelloListener2());
        return servletListenerRegistrationBean;
    }

}
