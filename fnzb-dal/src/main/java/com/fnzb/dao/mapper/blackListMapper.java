package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.blackList;

public interface blackListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(blackList record);

    int insertSelective(blackList record);

    blackList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(blackList record);

    int updateByPrimaryKey(blackList record);
}