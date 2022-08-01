package com.gupaoedu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GpSpringbootDemo02Application {

    public static void main(String[] args) {
        // Spring IoC 容器的初始化
        //ApplicationContext ac = SpringApplication.run(GpSpringbootDemo02Application.class, args);
        SpringApplication springApplication = new SpringApplication(GpSpringbootDemo02Application.class);
        springApplication.setBannerMode(Banner.Mode.OFF);// 关闭Banner
        springApplication.run(args);
    }
}
