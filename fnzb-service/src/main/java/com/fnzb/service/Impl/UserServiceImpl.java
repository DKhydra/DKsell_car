package com.fnzb.service.Impl;

import com.fnzb.dao.entity.event.UserEvent;
import com.fnzb.dao.mapper.UserMapper;
import com.fnzb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserByOpenId(String openId) {
        return userMapper.selectUserByOpenId(openId);
    }

    @Override
    public User findUserByMobile(Long mobile) {
        return userMapper.selectUserByMobile(mobile);
    }

    @Override
    public User findUserByUser(User user) {
        return userMapper.selectUserByUser(user);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean updateUser(User user) {
        user.setGmtModified(new Date());
        boolean falg =false;
        Integer result =userMapper.updateUser(user);

        if (result == 1){
            falg = true ;
        }
        return falg;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean addUser(User user) {
        user.setGmtCreate(new Date());
        boolean falg =false;
        Integer result =userMapper.insertUser(user);

        if (result == 1){
            falg = true ;
        }
        return falg;
    }
    @Override
    public List<User> findUserAll(UserEvent userEvent) {
        return userMapper.selectUserAll(userEvent);
    }

    @Override
    public int findCountUser(UserEvent userEvent) {
        return userMapper.selectUserCount(userEvent);
    }

    @Override
    public boolean findUserByIdNumber(String IdNumber) {
        boolean falg =false;
        User user = new User();
        user.setIdNumber(IdNumber);
        User result =userMapper.selectUserByUser(user);
        if (result != null){
            falg = true ;
        }
        return falg;
    }

    @Override
    public boolean findUserByEmail(String email) {
        boolean falg = false;
        User user = new User();
        user.setEmail(email);
        User result = userMapper.selectUserByUser(user);
        if (result != null) {
            falg = true;
        }
        return falg;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean removeUserById(List<Long> id) {
        boolean falg = false;
        int result = userMapper.deleteUserById(id);
        if(result > 0){
            falg = true ;
        }
        return falg;
    }
}
