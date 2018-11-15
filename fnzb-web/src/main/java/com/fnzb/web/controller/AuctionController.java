package com.fnzb.web.controller;

import com.fnzb.dao.entity.event.AuctionEvent;
import com.fnzb.result.ResultModel;
import com.fnzb.service.AuctionService;
import com.fnzb.spring.util.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 车辆信息
 */
@Controller
@RequestMapping("/auction")
public class AuctionController {
    private static final Logger logger = LoggerFactory.getLogger(AuctionController.class);

    @Autowired
    private AuctionService auctionService;

    /**
     * 根据条件获取所有参与竞拍车辆信息
     * @param
     * @return
     */
    @RequestMapping(value = "/findAllBiddingAuction", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAllBiddingAuction(AuctionEvent auctionEvent){
        ResultModel result = new ResultModel<>();

        return result.dump();
    }
}