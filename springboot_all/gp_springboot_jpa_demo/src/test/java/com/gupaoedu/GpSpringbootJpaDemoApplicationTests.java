package com.gupaoedu;

import com.gupaoedu.dao.UserRepository;
import com.gupaoedu.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GpSpringbootJpaDemoApplicationTests {

    @Autowired
    private UserRepository repository;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setName("gupao");
        user.setAge(4);
        repository.save(user);
    }
}
