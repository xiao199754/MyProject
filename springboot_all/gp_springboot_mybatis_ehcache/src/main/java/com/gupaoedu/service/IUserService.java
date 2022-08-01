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

    public Integer addUser(User user);

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    public User queryById(Integer id);

    public Integer updateUser(User user);

    public Integer deleteUserById(Integer id);
}
