package com.java.blog.dao;

import com.java.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/*
* user dao访问数据库
* */
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);
}
