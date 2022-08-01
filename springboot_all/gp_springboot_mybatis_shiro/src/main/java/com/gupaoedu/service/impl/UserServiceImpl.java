package com.gupaoedu.service.impl;

import com.gupaoedu.mapper.UserMapper;
import com.gupaoedu.pojo.User;
import com.gupaoedu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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


}
