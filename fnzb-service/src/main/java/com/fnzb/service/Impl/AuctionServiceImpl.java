package com.fnzb.service.Impl;

import com.fnzb.dao.entity.Auction;
import com.fnzb.dao.entity.Bidders;
import com.fnzb.dao.entity.event.AuctionEvent;
import com.fnzb.dao.mapper.AuctionMapper;
import com.fnzb.dao.mapper.BiddersMapper;
import com.fnzb.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuctionServiceImpl implements AuctionService {

    @Autowired
    private AuctionMapper auctionMapper;

    @Autowired
    private BiddersMapper biddersMapper;

    @Override
    public List<Auction> findAllBiddingAuction(AuctionEvent auctionEvent) {
        return auctionMapper.findAllBiddingAuction(auctionEvent);
    }

    @Override
    public List<Auction> findAllAuditParamter(AuctionEvent auctionEvent) {
        return auctionMapper.findAllAuditParamter(auctionEvent);
    }

    @Override
    public int selectBiddingAuctionCount(AuctionEvent auctionEvent) {
        return auctionMapper.selectBiddingAuctionCount(auctionEvent);
    }

    @Override
    public int selectAllAuditParamterCount(AuctionEvent auctionEvent) {
        return auctionMapper.selectAllAuditParamterCount(auctionEvent);
    }

    @Override
    public List<Auction> findSuccessAuction(String mobile) {
        List<Auction> auctions = new ArrayList<>();
        List<Bidders> list = biddersMapper.selectByCarInfo(Long.valueOf(mobile));
        if(list == null && list.size() > 0){
            return auctions;
        }
        for (Bidders bidders : list){
            Auction auction = auctionMapper.selectByPrimaryKey(bidders.getCarInfo());
            auctions.add(auction);
        }
        return auctions;
    }
}