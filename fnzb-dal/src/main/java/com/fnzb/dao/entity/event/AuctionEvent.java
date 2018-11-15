package com.fnzb.dao.entity.event;

import com.fnzb.utils.event.PageEvent;

import java.math.BigDecimal;


/**
 * 车辆分类页
 */
public class AuctionEvent extends PageEvent {

    //城市

    // 品牌
    private String trademark;

    // 价格
    private BigDecimal upsetPrice;

    // 筛选

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public BigDecimal getUpsetPrice() {
        return upsetPrice;
    }

    public void setUpsetPrice(BigDecimal upsetPrice) {
        this.upsetPrice = upsetPrice;
    }
}