package com.gupaoedu.service;

import com.gupaoedu.pojo.User;

import java.util.List;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/27 17:46
 */
public interface IUserService {

    public List<User> query(User user);

}
