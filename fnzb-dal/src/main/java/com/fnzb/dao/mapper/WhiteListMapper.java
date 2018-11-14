package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.WhiteList;

public interface WhiteListMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WhiteList record);

    int insertSelective(WhiteList record);

    WhiteList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WhiteList record);

    int updateByPrimaryKey(WhiteList record);
}