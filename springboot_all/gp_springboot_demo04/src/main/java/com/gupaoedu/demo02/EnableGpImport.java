package com.gupaoedu.demo02;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/21 15:31
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
//@Import(GpImportSelector.class)
@Import(GpImportBeanDefinition.class)
public @interface EnableGpImport {
}
