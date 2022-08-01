package com.gupaoedu.demo01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 15:24
 */
@Configuration
@Import({UserService.class})
public class JavaConfig {

    /*@Bean
    public UserService getUserSerivce(){
        return new UserService();
    }*/
}
