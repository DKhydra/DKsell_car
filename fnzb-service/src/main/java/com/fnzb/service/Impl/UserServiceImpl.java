package com.fnzb.service.Impl;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.mapper.UserMapper;
import com.fnzb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectByPrimaryKey(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
