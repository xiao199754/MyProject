package com.gupaoedu.demo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/26 20:59
 */
public class GpImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *  自己注册
     * @param annotationMetadata
     * @param beanDefinitionRegistry IoC容器的注册器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        // 将CacheService注册到IoC容器中
        RootBeanDefinition cache = new RootBeanDefinition(CacheService.class);
        beanDefinitionRegistry.registerBeanDefinition("cache111",cache);

        RootBeanDefinition logger = new RootBeanDefinition(LoggerService.class);
        beanDefinitionRegistry.registerBeanDefinition("logger222",logger);
    }
}
