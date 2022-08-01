package com.gupaoedu.demo02;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 15:29
 */
public class GpImportSelector implements ImportSelector {
    /**
     *  动态获取IoC要加载的类型
     * @param annotationMetadata 注解的元数据
     * @return
     *     IoC要加载的类型的数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 根据不同的业务逻辑 实现动态添加IoC加载的类型
        /*if (){

        }*/
        return new String[]{LoggerService.class.getName(),CacheService.class.getName()};
    }
}
