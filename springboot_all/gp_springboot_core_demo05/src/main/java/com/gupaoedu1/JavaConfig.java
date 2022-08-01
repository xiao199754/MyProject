package com.gupaoedu1;

import com.gupaoedu1.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 16:01
 */
@Configuration
public class JavaConfig {

    @Bean
    public PersonService getPersonService(){
        return new PersonService();
    }
}
