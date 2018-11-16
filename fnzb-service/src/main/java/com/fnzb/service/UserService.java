package com.fnzb.service;


import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserAddEvent;
import com.fnzb.dao.entity.event.UserEvent;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    /**
     * pc 多项删除用户
     * @param list
     * @return
     */
    boolean removeUser(List<Long> list);

    /**
     * 注册用户 注册信息 手机号 openId
     * @param userAddEvent
     * @return
     */
    boolean addUser (UserAddEvent userAddEvent);

    /**
     * 根据openId 进行查询
     * @param openId
     * @return
     */
    User selectUserByOpenId(@Param("openId") String openId);

    /**
     * 根据手机号进行查询
     * @param mobile
     * @return
     */
    User selectUserByMobile(Long mobile);

    /**
     *  pc 分页 查询
     * @param userEvent
     * @return
     */
    List<User> selectUserAll(UserEvent userEvent);

    /**
     * 分页 统计总数
     * @param userEvent
     * @return
     */
    int findUserCount(UserEvent userEvent);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean modifyUser(User user);

    /**
     * 验证 身份证是否存在
     * @param idNumber
     * @return
     */
    boolean verifyIdNumber(String idNumber);

    /**
     * 验证手机号是否存在
     * @param mobile
     * @return
     */
    boolean verifyMobile(Long mobile);


}