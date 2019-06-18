package com.itheima.ssm.dao;

import com.itheima.ssm.domain.UserInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    /**
     * 更具用户名查询用户信息
     * @param username
     * @return 返回用户对对象
     */
    UserInfo findByUsername(String username);

    /**
     * 查询所有用户
     * @return
     */
    List<UserInfo> findAll();
}
