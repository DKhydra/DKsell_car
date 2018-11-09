package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.AuctionExamine;

public interface AuctionExamineMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuctionExamine record);

    int insertSelective(AuctionExamine record);

    AuctionExamine selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuctionExamine record);

    int updateByPrimaryKey(AuctionExamine record);
}