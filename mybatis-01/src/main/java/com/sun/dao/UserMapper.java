package com.sun.dao;

import com.sun.pojo.User;

import java.util.List;

/**
 * @Author SunHao
 * @Date 2020/9/1 15:44
 */
public interface UserMapper {

    //扩展模糊查询
    List<User> getUserLike(String value);

    //查询全部用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(int id);

    //insert一个用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除一个用户
    int deleteUser(int id);
}
