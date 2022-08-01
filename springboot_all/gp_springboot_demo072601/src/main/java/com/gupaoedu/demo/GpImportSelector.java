package com.gupaoedu.demo;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/26 20:49
 */
public class GpImportSelector implements ImportSelector {
    /**
     *
     * @param annotationMetadata
     * @return
     *     返回的IoC要加载的类型的全路径名称的数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        // 可以根据自身的业务场景 添加对应逻辑返回对应的数据
        /*if(){

        }else{

        }*/
        return new String[]{LoggerService.class.getName(),CacheService.class.getName()};
    }
}
