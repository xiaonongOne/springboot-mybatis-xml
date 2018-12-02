package com.example.mybatis.service.impl;

import com.example.mybatis.bean.User;
import com.example.mybatis.dao.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *@ClassName UserServiceImpl.java
 *@Description 用户实现类
 *@Author Xiao Nong
 *@Date 2018/12/2
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUserByUserId(Long id) {
        return userMapper.selectUserByUserId(id);
    }

    @Override
    public int createUser(User record) {
        return userMapper.createUser(record);
    }

    @Override
    public int deleteByUserId(Long id) {
        return userMapper.deleteByUserId(id);
    }

    @Override
    public int modifyUserByUserId(User record) {
        return userMapper.modifyUserByUserId(record);
    }
}
