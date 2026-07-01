package com.shuhua.springbootmall.service.impl;

import com.shuhua.springbootmall.dao.UserDao;
import com.shuhua.springbootmall.dto.UserLoginRequest;
import com.shuhua.springbootmall.dto.UserRegisterRequest;
import com.shuhua.springbootmall.model.User;
import com.shuhua.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;
import org.springframework.web.server.ResponseStatusException;

;


@Component
public class UserServiceImpl implements UserService {

    private final static Logger logger = (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        User user=userDao.getUserByEmail(userRegisterRequest.getEmail());
        if(user!=null){
            logger.warn("該email {} 已被註冊",userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }else{
            //使用MD5 生成密碼的雜湊值
            String hashPassword = DigestUtils.md5DigestAsHex(userRegisterRequest.getPassword().getBytes());
            userRegisterRequest.setPassword(hashPassword);

            //創建帳號
            return userDao.createUser(userRegisterRequest);}
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public User login(UserLoginRequest userLoginRequest) {
        User user=userDao.getUserByEmail(userLoginRequest.getEmail());
        //檢查user是否存在
        if(user==null){
            logger.warn("該email {} 尚未註冊", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //使用MD5 生成密碼的雜湊值
        String hashpassword=DigestUtils.md5DigestAsHex(userLoginRequest.getPassword().getBytes());


        //比較密碼
        if(user.getPassword().equals(hashpassword)){
            return user;
        }else{
            logger.warn("該email {} 的密碼不正確", userLoginRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

    }
}
