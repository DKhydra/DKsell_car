package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.event.UserEvent;

import java.util.List;

public interface UserMapper {

   User selectUserByOpenId(String openId);

   User selectUserByMobile(Long mobile);

   User selectUserByUser(User user);

   int updateUser(User user);

   int insertUser(User user);

   List<User> selectUserAll(UserEvent userEvent);

   int selectUserCount(UserEvent userEvent);

   int deleteUserById(List<Long> id);
}