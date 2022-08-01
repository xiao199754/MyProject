package com.gupaoedu.service.impl;

import com.gupaoedu.service.UserService;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 让每一个人的职业生涯不留遗憾
 *
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/29 10:44
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        // 模拟数据库操作 根据账号查询
        String password = "$2a$10$9tzTU0L5cM7e25RPo.KGnOfzUzeulD0CzOoawooYSiUlrPABkCPXG";
        // 假设查询出来的用户的角色
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        list.add(new SimpleGrantedAuthority("USER1"));
        UserDetails userDetails = new User(s,password,list);
        return userDetails;
    }
}
