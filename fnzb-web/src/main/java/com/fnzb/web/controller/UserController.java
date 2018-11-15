package com.fnzb.web.controller;

import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserEvent;
import com.fnzb.exception.XbaseError;
import com.fnzb.result.ResultModel;
import com.fnzb.service.UserService;
import com.fnzb.spring.util.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger("UserController");

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/removeUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> removeUser(@RequestBody List<Long> list) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.removeUser(list);
        if (resultInfo == true ){
            result.setReturnMessage("删除成功");
            result.setReturnCode("000000");
        }else {
            result.setReturnMessage("删除失败");
            result.setReturnCode(XbaseError.FAIL_TO_DELETE.getErrorCode());
        }
        return result.dump();
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addUser(@RequestBody User user) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.addUser(user);
        if (resultInfo == true  ){
            result.setReturnMessage("添加成功");
            result.setReturnCode("000000");
        }else {
            result.setReturnMessage("添加失败");
            result.setReturnCode(XbaseError.FAIL_TO_ADD.getErrorCode());
        }
        return result.dump();
    }
    @RequestMapping(value = "/selectUserByOpenId", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> selectUserByOpenId(String openId) {
        ResultModel<User> result = new ResultModel<>();
        User resultInfo =userService.selectUserByOpenId(openId);
        if (resultInfo != null ){
            result.setData(resultInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }
    @RequestMapping(value = "/selectUserByMobile", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> selectUserByMobile(Long mobile) {
        ResultModel<User> result = new ResultModel<>();
        User resultInfo =userService.selectUserByMobile(mobile);
        if (resultInfo != null ){
            result.setData(resultInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }
    @RequestMapping(value = "/selectUserAll", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> selectUserAll(@RequestBody UserEvent userEvent) {
        ResultModel<PageInfo<User>> result = new ResultModel<>();
        int userCount = userService.findUserCount(userEvent);
        if (userCount != 0 ){
            List<User> resultInfo =userService.selectUserAll(userEvent);
            PageInfo<User> pageInfo = new PageInfo<>(resultInfo);
            pageInfo.setCurrentPage(userEvent.getPageIndex());
            pageInfo.setPageSize(userEvent.getPageSize());
            pageInfo.setTotal(userCount);
            result.setData(pageInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    @RequestMapping(value = "/verifyIdNumber", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> verifyIdNumber(String idNumber) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.verifyIdNumber(idNumber);
        if (resultInfo == true ){
            result.setReturnMessage("身份证已存在");
            result.setReturnCode("000000");
        }else {
            result.setReturnMessage("未存在");
            result.setReturnCode(XbaseError.FAIL_TO_SELECT.getErrorCode());
        }
        return result.dump();
    }


    @RequestMapping(value = "/verifyMobile", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> verifyMobile(Long mobile) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.verifyMobile(mobile);
        if (resultInfo == true ){
            result.setReturnMessage("手机号已存在");
            result.setReturnCode("000000");
        }else {
            result.setReturnMessage("未存在");
            result.setReturnCode(XbaseError.FAIL_TO_SELECT.getErrorCode());
        }
        return result.dump();
    }
}
