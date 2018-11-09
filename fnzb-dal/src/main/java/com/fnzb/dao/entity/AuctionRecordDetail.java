package com.fnzb.dao.entity;

import java.util.Date;

public class AuctionRecordDetail {
    private Long id;

    private Long biddersPrice;

    private Date biddingTime;

    private Long sarId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBiddersPrice() {
        return biddersPrice;
    }

    public void setBiddersPrice(Long biddersPrice) {
        this.biddersPrice = biddersPrice;
    }

    public Date getBiddingTime() {
        return biddingTime;
    }

    public void setBiddingTime(Date biddingTime) {
        this.biddingTime = biddingTime;
    }

    public Long getSarId() {
        return sarId;
    }

    public void setSarId(Long sarId) {
        this.sarId = sarId;
    }
}