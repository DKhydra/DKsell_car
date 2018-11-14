package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Login;

public interface LoginMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Login record);

    int insertSelective(Login record);

    Login selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Login record);

    int updateByPrimaryKey(Login record);
}