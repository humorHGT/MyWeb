package com.humor.myweb.dao;

import com.humor.myweb.pojo.User;

import java.util.List;


public interface UserMapper {
    //增删改查
    int insert(User user);
    int delete(int userid);
    int update(User user);
    List<User> query();
}
