package com.gupaoedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
import  java.util.Properties;

@SpringBootApplication
public class GpSpringbootDemo08ThymeleafApplication {

    public static void main(String[] args) {
        SpringApplication.run(GpSpringbootDemo08ThymeleafApplication.class, args);
    }

    /**
     * 异常信息和对应的 处理地址的 映射
     * @return
     */
    /*@Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){

        SimpleMappingExceptionResolver mapping = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        mappings.setProperty("java.lang.NullPointerException","error1");
        mappings.setProperty("java.lang.ArithmeticException","error2");
        mapping.setExceptionMappings(mappings);
        return mapping;
    }*/

}
