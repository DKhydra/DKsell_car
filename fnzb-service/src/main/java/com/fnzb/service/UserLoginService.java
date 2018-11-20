package com.fnzb.service;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.UserLogin;

public interface UserLoginService {

    /**
     * 增添管理员
     * @param userLogin
     * @return
     */
    boolean insert(UserLogin userLogin);

    /**
     * 更改管理员帐号
     * @param userLogin
     * @return
     */
    boolean updateUserLogin(UserLogin userLogin);

    /**
     * 查询管理员帐号  登录验证
     * @param userLogin
     * @return
     */
    User selectUserForPC(UserLogin userLogin);
}
