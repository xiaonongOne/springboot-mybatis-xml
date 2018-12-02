package com.example.mybatis.controller;

import com.example.mybatis.bean.User;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 *@ClassName UserController.java
 *@Description 测试类
 *@Author Xiao Nong
 *@Date 2018/12/2
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;


    /**
     * @Description: 通过id查询用户信息
     * @Param: [id]
     * @return: User
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    @RequestMapping(value = "/findUserByUserId/{userId}")
    public User findUserInfo(@PathVariable("userId") Long id) {
        return userService.selectUserByUserId(id);
    }

    /**
     * @Description: 保存用户信息方法
     * @Param: [user]
     * @return:
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    @RequestMapping(value = "/createUser")
    public Map<String,Object> saveUser(User user) {
        Map<String,Object> map = new HashMap<>();
        int row = userService.createUser(user);
        if (row > 0) {
            map.put("msg","添加成功！");
            map.put("flag","true");
        } else {
            map.put("msg","添加失败！");
            map.put("flag","false");
        }
        return map;
    }

    /**
     * @Description: 修改用户信息方法
     * @Param: [user]
     * @return: void
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    @RequestMapping(value = "modify")
    public void update (User user) {
        userService.modifyUserByUserId(user);
    }


    /**
     * @Description:  删除用户信息方法
     * @Param: [id]
     * @return: void
     * @Author: Xiao Nong
     * @Date: 2018/12/2
     */
    @RequestMapping(value = "delete/{userId}")
    public void delete (@PathVariable("userId") Long id) {
        userService.deleteByUserId(id);
    }
}
