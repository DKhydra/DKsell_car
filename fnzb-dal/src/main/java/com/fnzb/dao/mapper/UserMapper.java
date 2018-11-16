package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserAddEvent;
import com.fnzb.dao.entity.event.UserEvent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int deleteUserById(List<Long> list);

    int insert(UserAddEvent userAddEvent);

    User selectUserByOpenId(@Param("openId") String openId);

    User selectUserByMobile(Long mobile);

    List<User> selectUserAll(UserEvent userEvent);

    int selectUserCount(UserEvent userEvent);

    int updateUser(User user);

    int verifyIdNumber(@Param("idNumber") String idNumber);

    int verifyMobile(@Param("mobile") Long mobile);

    User selectUserForLogin(User user);


}