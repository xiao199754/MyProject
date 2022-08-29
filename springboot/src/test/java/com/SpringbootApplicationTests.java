package com;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    private RedisTemplate<String,Object> template;

    @Test
    void contextLoads() {
        this.template.opsForValue().set("name","pjx");
    }

}
