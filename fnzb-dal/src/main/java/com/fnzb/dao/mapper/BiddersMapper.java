package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Bidders;

import java.util.List;

public interface BiddersMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bidders record);

    int insertSelective(Bidders record);

    Bidders selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bidders record);

    int updateByPrimaryKey(Bidders record);

    List<Bidders> selectByCarInfo(Long userId);
}