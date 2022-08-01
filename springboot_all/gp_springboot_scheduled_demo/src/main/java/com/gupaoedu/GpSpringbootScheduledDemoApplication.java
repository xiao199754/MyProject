package com.gupaoedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling // 放开Scheduled定时任务
public class GpSpringbootScheduledDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpSpringbootScheduledDemoApplication.class, args);
    }

}
