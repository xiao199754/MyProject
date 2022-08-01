package com.gupaoedu.service.impl;

import com.gupaoedu.mapper.UserMapper;
import com.gupaoedu.pojo.User;
import com.gupaoedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 17:47
 */
@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper mapper;
    @Override
    public List<User> query(User user) {
        return mapper.query(user);
    }

    @Override
    public Integer addUser(User user) {
        return mapper.addUser(user);
    }

    @Cacheable(value = {"userQuery"})
    @Override
    public User queryById(Integer id) {
        System.out.println("用户查询：" + id);
        return mapper.queryById(id);
    }

    @Override
    public Integer updateUser(User user) {
        return mapper.updateUser(user);
    }

    @Override
    public Integer deleteUserById(Integer id) {
        return mapper.deleteUserById(id);
    }
}
