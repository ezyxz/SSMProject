package com.xinyuan.sm.service;

import com.xinyuan.sm.pojo.User;
import com.xinyuan.sm.pojo.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("getUserService")
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao mapper;
    @Override
    public User getUserById(Integer id) {
        return  mapper.getUserById(id);
    }
}
