package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.AuctionRecordDetail;

public interface AuctionRecordDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AuctionRecordDetail record);

    int insertSelective(AuctionRecordDetail record);

    AuctionRecordDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AuctionRecordDetail record);

    int updateByPrimaryKey(AuctionRecordDetail record);
}