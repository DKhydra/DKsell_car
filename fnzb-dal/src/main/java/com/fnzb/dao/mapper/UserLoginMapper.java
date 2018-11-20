package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.UserLogin;
import com.fnzb.dao.entity.event.UserAddEvent;
import com.fnzb.dao.entity.event.UserEvent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserLoginMapper {

    // int deleteUserById(List<Long> list);


    int insert(UserLogin userLogin);


    int updateUserLogin(UserLogin userLogin);


    User selectUserForPC(UserLogin userLogin);


}