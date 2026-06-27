package com.shuhua.springbootmall.dao;

import com.shuhua.springbootmall.dto.UserRegisterRequest;
import com.shuhua.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
