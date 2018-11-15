package com.fnzb.dao.mapper;

import com.fnzb.dao.entity.Auction;
import com.fnzb.dao.entity.event.AuctionEvent;

import java.util.List;

public interface AuctionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Auction record);

    int insertSelective(Auction record);

    Auction selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Auction record);

    int updateByPrimaryKey(Auction record);

    /**
     * 查询所有已审核数据还未交易成功的数据
     * @return
     */
    List<Auction> findAllBiddingAuction(AuctionEvent auctionEvent);

    /**
     * 查询已审核数据
     * @return
     */
    List<Auction> findAllAuditParamter(AuctionEvent auctionEvent);

    /**
     * 统计已审核数据还未交易成功的数据
     * @return
     */
    int selectBiddingAuctionCount(AuctionEvent auctionEvent);

    /**
     * 统计已审核的数据
     * @return
     */
    int selectAllAuditParamterCount(AuctionEvent auctionEvent);
}