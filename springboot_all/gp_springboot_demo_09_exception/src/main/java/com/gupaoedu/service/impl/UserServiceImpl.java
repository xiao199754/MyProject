package com.gupaoedu.service.impl;

import com.gupaoedu.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 16:54
 */
@Service
public class UserServiceImpl implements IUserService {
    @Override
    public String query() {
        return "UserService 单元测试";
    }
}
