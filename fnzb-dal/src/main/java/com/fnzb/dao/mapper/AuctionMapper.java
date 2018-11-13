package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Auction;
import com.fnzb.dao.entity.AuctionKey;
import com.fnzb.dao.entity.event.AuctionEvent;
import java.util.List;

public interface AuctionMapper {
    int deleteByPrimaryKey(AuctionKey key);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(AuctionKey key);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);

    List<Auction> findAll(AuctionEvent auctionEvent);

    int selectAuctionCount(AuctionEvent auctionEvent);
}