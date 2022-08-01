package com.gupaoedu.demo02;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 15:37
 */
public class GpImportBeanDefinition implements ImportBeanDefinitionRegistrar {
    /**
     *  提供了一个beanDefinition的注册器，我直接把需要IoC加载的类型注册到容器中去
     * @param annotationMetadata
     * @param beanDefinitionRegistry beanDefinition的注册器
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        // 将我们需要添加的类型统一封装为RootBeanDefinition对象
        RootBeanDefinition cache = new RootBeanDefinition(CacheService.class);
        beanDefinitionRegistry.registerBeanDefinition("cache",cache);
        RootBeanDefinition logger = new RootBeanDefinition(LoggerService.class);
        beanDefinitionRegistry.registerBeanDefinition("logger",logger);
    }
}
