package com.fnzb.web.controller;

import com.fnzb.dao.entity.Auction;
import com.fnzb.dao.entity.event.AuctionEvent;
import com.fnzb.exception.XbaseError;
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
     * 参与竞拍
     *
     * 根据条件获取所有参与竞拍车辆信息
     * @param
     * @return
     */
    @RequestMapping(value = "/findAllBiddingAuction", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAllBiddingAuction(AuctionEvent auctionEvent){
        ResultModel<PageInfo<Auction>> result = new ResultModel<>();
        // 统计已审核数据还未交易成功的数据
        int auctionCount = auctionService.selectBiddingAuctionCount(auctionEvent);
        if(auctionCount != 0){
            // 查询已审核还未拍卖的车辆信息
            List<Auction> list  = auctionService.findAllBiddingAuction(auctionEvent);
            PageInfo<Auction> pageInfo = setPageInfo(list, auctionCount, auctionEvent);
            result.setData(pageInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    /**
     * 过往竞拍
     *
     * 查询所有已审核的数据
     * @param auctionEvent
     * @return
     */
    @RequestMapping(value = "/findAllBiddingAuctionHistory", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAllBiddingAuctionHistory(AuctionEvent auctionEvent){
        ResultModel<PageInfo<Auction>> result = new ResultModel<>();
        // 统计已审核的数据
        int auctionCount = auctionService.selectAllAuditParamterCount(auctionEvent);
        if(auctionCount != 0){
            // 查询已审核还未拍卖的车辆信息
            List<Auction> list  = auctionService.findAllAuditParamter(auctionEvent);
            PageInfo<Auction> pageInfo = setPageInfo(list, auctionCount, auctionEvent);
            result.setData(pageInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    /**
     * 拍卖成功
     *
     * 查询个人竞拍成功信息
     * @param mobile
     * @return
     */
    @RequestMapping("/findSuccessAuction")
    @ResponseBody
    public Map<String, Object> findSuccessAuction(String mobile){
        ResultModel result = new ResultModel<>();
        List<Auction> list = auctionService.findSuccessAuction(mobile);
        result.setData(list);
        return result.dump();
    }

    /**
     * 封装分页信息
     * @param list
     * @param auctionCount
     * @param auctionEvent
     * @return
     */
    private PageInfo<Auction> setPageInfo(List<Auction> list, int auctionCount, AuctionEvent auctionEvent){
        PageInfo<Auction> pageInfo = new PageInfo<>(list);
        pageInfo.setCurrentPage(auctionEvent.getPageIndex());
        pageInfo.setPageSize(auctionEvent.getPageSize());
        pageInfo.setTotal(auctionCount);
        return pageInfo;
    }
}