package com.fnzb.service;

import com.fnzb.dao.entity.Auction;
import com.fnzb.dao.entity.event.AuctionEvent;

import java.util.List;

public interface AuctionService {

    /**
     * 获取所有参与竞拍的车辆信息数据
     * @param auctionEvent
     * @return
     */
    List<Auction> findAllBiddingAuction(AuctionEvent auctionEvent);

    /**
     * 查询所有已审核数据
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

    /**
     * 查询个人拍卖成功车辆信息
     * @param mobile
     * @return
     */
    List<Auction> findSuccessAuction(String mobile);
}