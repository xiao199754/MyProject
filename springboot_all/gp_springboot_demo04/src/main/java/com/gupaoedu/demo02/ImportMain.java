package com.gupaoedu.demo02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 15:32
 */
@EnableGpImport
public class ImportMain {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ImportMain.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames){
            System.out.println(beanName);
        }
    }
}
