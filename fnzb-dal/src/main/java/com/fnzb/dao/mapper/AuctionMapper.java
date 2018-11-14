package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Auction;

public interface AuctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);
}