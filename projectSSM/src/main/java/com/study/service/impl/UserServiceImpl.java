package com.study.service.impl;

import com.study.entity.User;
import com.study.repository.UserRepository;
import com.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findUser() {
        return userRepository.findUser();
    }

    @Override
    public int updateUser(User user) {
        return userRepository.updateUser(user);
    }

    @Override
    public int deleteUser(User user) {
        return userRepository.deleteUser(user);
    }

    @Override
    public int insertUser(User user) {
        return userRepository.insertUser(user);
    }
}
