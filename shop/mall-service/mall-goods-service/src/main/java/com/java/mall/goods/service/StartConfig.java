package com.java.mall.goods.service;

import org.mybatis.spring.annotation.MapperScan;
import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StartConfig {

    /****
     * 分页拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        //创建拦截器对象
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        //添加分页拦截器
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        //返回拦截器
        return interceptor;
    }

}
