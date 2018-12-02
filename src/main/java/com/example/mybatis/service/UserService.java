package com.example.mybatis.service;

import com.example.mybatis.bean.User;

/**
 *@ClassName UserService.java
 *@Description 用户接口
 *@Author Xiao Nong
 *@Date 2018/12/2
 **/
public interface UserService {

    /**
     * @Description: 通过用户id查询User用户
     * @Param: id
     * @return: [user]
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    User selectUserByUserId(Long id);

    /**
     * @Description: 保存方法
     * @Param: [user]
     * @return: int
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    int createUser(User record);

    /**
     * @Description:  删除方法
     * @Param: [id]
     * @return: int
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    int deleteByUserId(Long id);

    /**
     * @Description:  更改方法
     * @Param: [user]
     * @return: int
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    int modifyUserByUserId(User record);
}
