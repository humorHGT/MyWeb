package com.humor.myweb.service;

import com.humor.myweb.pojo.User;

import java.util.List;

public interface Userservice {
    int insert(User user);
    int delete(int userid);
    int update(User user);
    List<User> query();
}
