package com.gupaoedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GpSpringbootQuartzDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpSpringbootQuartzDemoApplication.class, args);
    }

}
