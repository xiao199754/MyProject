package com.java.chengma;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMPP
@MapperScan(basePackages = "com.java.chengma.mapper")
public class ChengmaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChengmaApplication.class,args);
    }
}
