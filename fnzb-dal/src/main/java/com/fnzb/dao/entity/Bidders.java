package com.fnzb.dao.entity;

import java.util.Date;

public class Bidders {
    private Long id;

    private Long userId;

    private Long carInfo;

    private Long price;

    private Date biddersTime;

    private Byte isDeal;

    private Date gmtCreate;

    private Date gmtModified;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(Long carInfo) {
        this.carInfo = carInfo;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getBiddersTime() {
        return biddersTime;
    }

    public void setBiddersTime(Date biddersTime) {
        this.biddersTime = biddersTime;
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
}