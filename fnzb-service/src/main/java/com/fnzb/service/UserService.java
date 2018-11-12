package com.fnzb.service;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserEvent;

import java.util.List;

public interface UserService {

//    User selectByPrimaryKey(Long id);

    /**
     * 根据用户的openId获取用户的信息
     * @param openId
     * @return User
     *
     */
    User findUserByOpenId(String openId);

    /**
     * 根据手机号获取用户的信息
     * @param mobile
     * @return User
     */
    User findUserByMobile(Long mobile);

    /**
     * 用户真实姓名、身份证是否验、手机号、身份证号、openid
     * @param user
     * @return User
     */
    User findUserByUser(User user);

    /**
     * 根据用户的openId进行修改  用户的基础信息更新
     * @param user
     * @return
     */
    boolean updateUser(User user);

    /**
     * 添加用户  用户的基础信息必填
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     *  获取用户列表
     * @param
     * @return
     */
    List<User> findUserAll(UserEvent userEvent);

    /**
     * 统计用户数据 分页***
     * @param userEvent
     * @return
     */
    int findCountUser(UserEvent userEvent);

    /**
     * 验证用户输入的身份证号 只能有一个
     * @param IdNumber
     * @return
     */
    boolean findUserByIdNumber(String IdNumber);

    /**
     * 验证用户输入的邮箱 有且只有一个邮箱
     * @param email
     * @return
     */
    boolean findUserByEmail(String email);

    /**
     * 批量删除用户
     * @param id
     * @return
     */
    boolean removeUserById(List<Long> id);
}
