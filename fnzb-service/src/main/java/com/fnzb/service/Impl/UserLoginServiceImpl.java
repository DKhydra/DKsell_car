package com.fnzb.service.Impl;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.UserLogin;
import com.fnzb.dao.mapper.UserLoginMapper;
import com.fnzb.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapper userLoginMapper;


    @Override
    public boolean insert(UserLogin userLogin) {

        boolean falg =  false;
        int result = userLoginMapper.insert(userLogin);
        if (result == 1) {
            falg = true;
        }
        return falg;
    }

    @Override
    public boolean updateUserLogin(UserLogin userLogin) {
        boolean falg =  false;
        int result = userLoginMapper.updateUserLogin(userLogin);
        if (result == 1) {
            falg = true;
        }
        return falg;
    }

    @Override
    public User selectUserForPC(UserLogin userLogin) {
        return userLoginMapper.selectUserForPC(userLogin);
    }
}
