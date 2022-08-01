package com.gupaoedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GpSpringbootDemo0726Application {

    public static void main(String[] args) {
        // IoC容器的初始化操作  通过注解的方式加载容器
        ApplicationContext ac = SpringApplication.run(GpSpringbootDemo0726Application.class, args);
    }

}
