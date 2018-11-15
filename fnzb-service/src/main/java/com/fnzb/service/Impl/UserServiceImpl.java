package com.fnzb.service.Impl;

import com.aliyuncs.exceptions.ClientException;
import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserEvent;
import com.fnzb.dao.mapper.UserMapper;
import com.fnzb.service.UserService;

import com.fnzb.utils.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Date;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

// TODO 删除该用户下所有记录 车辆、交易记录、账号金额
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeUser(List<Long> list) {
        boolean flag = false ;
        int result = userMapper.deleteUserById(list);
        if (result > 0 ) {
            flag = true;
        }
        return flag;
    }
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addUser(User user) {
        user.setGmtCreate(new Date());
        boolean flag = false ;
        int result = userMapper.insert(user);
        if (result == 1 ) {
            flag = true;
        }
        return flag;
    }


    @Override
    public User selectUserByOpenId(String openId) {
        return userMapper.selectUserByOpenId(openId);
    }

    @Override
    public User selectUserByMobile(Long mobile) {
        return userMapper.selectUserByMobile(mobile);
    }

    @Override
    public List<User> selectUserAll(UserEvent userEvent) {
        return userMapper.selectUserAll(userEvent);
    }

    @Override
    public int findUserCount(UserEvent userEvent) {
        return userMapper.selectUserCount(userEvent);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean modifyUser(User user) {
        boolean flag = false ;
        int result = userMapper.updateUser(user);
        if (result == 1 ) {
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean verifyIdNumber(String idNumber) {
        boolean flag = false ;
        int result = userMapper.verifyIdNumber(idNumber);
        if (result == 1 ) {
            flag = true;
        }
        return flag;
    }

    @Override
    public boolean verifyMobile(Long mobile) {
        boolean flag = false ;
        int result = userMapper.verifyMobile(mobile);
        if (result == 1 ) {
            flag = true;
        }
        return flag;
    }
}