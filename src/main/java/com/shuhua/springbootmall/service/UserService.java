package com.shuhua.springbootmall.service;

import com.shuhua.springbootmall.dto.UserLoginRequest;
import com.shuhua.springbootmall.dto.UserRegisterRequest;
import com.shuhua.springbootmall.model.User;
import org.springframework.stereotype.Component;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
    User login(UserLoginRequest userLoginRequest);
}
