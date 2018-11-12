package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Login;

public interface LoginMapper {

    int insertLogin(Login record);

    Login selectByLogin(Login login);

    int update(Login login);

    int selectByUserName(Long userName);

}