package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.AuctionRecord;

public interface AuctionRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuctionRecord record);

    int insertSelective(AuctionRecord record);

    AuctionRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuctionRecord record);

    int updateByPrimaryKey(AuctionRecord record);
}