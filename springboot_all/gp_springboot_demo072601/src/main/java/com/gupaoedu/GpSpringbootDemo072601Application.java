package com.gupaoedu;

import com.gupaoedu1.bean.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GpSpringbootDemo072601Application {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(GpSpringbootDemo072601Application.class, args);
        System.out.println(ac.getBean(UserService.class));
    }

}
