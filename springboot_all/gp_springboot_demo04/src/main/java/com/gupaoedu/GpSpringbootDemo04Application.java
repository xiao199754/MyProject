package com.gupaoedu;

import com.gupaoedu1.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GpSpringbootDemo04Application {

    public static void main(String[] args) {
        // IoC容器的初始化
        ApplicationContext ac = SpringApplication.run(GpSpringbootDemo04Application.class, args);
        System.out.println(ac.getBean(PersonService.class));
    }

}
