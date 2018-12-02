package com.example.mybatis.dao;

import com.example.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 *@ClassName UserMapper.java
 *@Description 数据操作类
 *@Author Xiao Nong
 *@Date 2018/12/2
 **/
@Mapper
public interface UserMapper {

    /**
     *@ClassName UserMapper.java
     *@Description 通过用户id查询User
     *@Author Xiao Nong
     *@Date 2018/12/2
     **/
    User selectUserByUserId(Long id);

    /**
     *@ClassName UserMapper.java
     *@Description 保存用户信息
     *@Author Xiao Nong
     *@Date 2018/12/2
     **/
    int createUser(User record);

    /**
     *@ClassName UserMapper.java
     *@Description 删除用户信息
     *@Author Xiao Nong
     *@Date 2018/12/2
     **/
    int deleteByUserId(Long id);

    /**
     *@ClassName UserMapper.java
     *@Description 修改用户信息
     *@Author Xiao Nong
     *@Date 2018/12/2
     **/
    int modifyUserByUserId(User record);

}