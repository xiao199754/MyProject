package com.gupaoedu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 17:37
 */
@SpringBootApplication
@MapperScan("com.gupaoedu.mapper") // 用户扫描Mapper接口
public class StartApp {

    public static void main(String[] args) {
        SpringApplication.run(StartApp.class,args);
    }
}


