package com.fnzb.service.Impl;

import com.fnzb.dao.entity.Login;
import com.fnzb.dao.mapper.LoginMapper;
import com.fnzb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;

    /**
     * 根据手机号查询用户id
     * @param mobile
     * @return
     */
    @Override
    public Long findIdByMobile(Long mobile) {
        return loginMapper.selectIdByMobile(mobile);
    }

    /**
     * 根据mobile和密码查询
     * @param mobile
     * @param password
     * @return
     */
    @Override
    public Login findByMobileAndPassword(Long mobile, String password) {
        return loginMapper.selectByMobileAndPassword(mobile, password);
    }
}