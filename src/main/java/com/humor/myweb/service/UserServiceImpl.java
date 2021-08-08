package com.humor.myweb.service;

import com.humor.myweb.dao.UserMapper;
import com.humor.myweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements Userservice{
    @Autowired UserMapper userMapper;

    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int delete(int userid) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> query() {
        return userMapper.query();
    }
}
