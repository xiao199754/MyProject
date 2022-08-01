package com.gupaoedu.dao;

import com.gupaoedu.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 让每一个人的职业生涯不留遗憾
 *   JpaRepository<User,Integer>
 *       User 映射的实体对象
 *       Integer Id的类型
 * @author 波波老师【咕泡学院】
 * @Description: ${todo}
 * @date 2020/7/31 10:19
 */
public interface UserRepository extends JpaRepository<User,Integer> {
}
