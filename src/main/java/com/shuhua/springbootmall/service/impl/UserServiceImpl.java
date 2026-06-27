package com.shuhua.springbootmall.service.impl;

import com.shuhua.springbootmall.dao.UserDao;
import com.shuhua.springbootmall.dao.impl.UserDaoImpl;
import com.shuhua.springbootmall.dto.UserRegisterRequest;
import com.shuhua.springbootmall.model.User;
import com.shuhua.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
