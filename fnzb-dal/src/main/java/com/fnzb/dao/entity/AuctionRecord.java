package com.fnzb.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AuctionRecord {
    private Long id;

    private Long carInfo;

    private Long biddersId;

    private Long auctionId;

    private Byte isDeal;

    private Date gmtCreate;

    private Date gmtModified;

    private BigDecimal bond;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Long carInfo) {
        this.carInfo = carInfo;
    }

    public Long getBiddersId() {
        return biddersId;
    }

    public void setBiddersId(Long biddersId) {
        this.biddersId = biddersId;
    }

    public Long getAuctionId() {
        return auctionId;
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Byte getIsDeal() {
        return isDeal;
    }

    public void setIsDeal(Byte isDeal) {
        this.isDeal = isDeal;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public BigDecimal getBond() {
        return bond;
    }

    public void setBond(BigDecimal bond) {
        this.bond = bond;
    }
}