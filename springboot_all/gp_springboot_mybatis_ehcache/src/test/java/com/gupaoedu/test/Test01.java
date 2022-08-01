package com.gupaoedu.test;

import com.gupaoedu.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/29 14:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching// 放开缓存
public class Test01 {

    @Autowired
    private IUserService userService;

    @Test
    public void test01(){
        userService.queryById(1);
        userService.queryById(1);
    }
}
