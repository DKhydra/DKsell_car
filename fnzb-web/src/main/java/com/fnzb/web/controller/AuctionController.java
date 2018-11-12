package com.fnzb.web.controller;

import com.fnzb.dao.entity.Auction;
import com.fnzb.result.ResultModel;
import com.fnzb.service.AuctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
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
    @RequestMapping("/findAll")
    @ResponseBody
    public Map<String, Object> findAll(){
        ResultModel result = new ResultModel<>();
        List<Auction> list  = auctionService.findAll();
        System.out.println(list);
        result.setData(list);
        return result.dump();
    }
}