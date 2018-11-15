package com.fnzb.web.controller;

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

    @RequestMapping(value = "/findUserByOpenId", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findUserByOpenId(String openId) {
        ResultModel<User> result = new ResultModel<>();
            User resultInfo =userService.findUserByOpenId(openId);
            if (resultInfo != null ){
                result.setData(resultInfo);
            }else {
                result.setReturnMessage("查询为空");
                result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
            }
        return result.dump();
    }

    @RequestMapping(value = "/findUserByMobile", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findUserByMobile(Long mobile) {
        ResultModel<User> result = new ResultModel<>();
        User resultInfo =userService.findUserByMobile(mobile);
        if (resultInfo != null ){
            result.setData(resultInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    @RequestMapping(value = "/findUserByUser", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findUserByUser(User user) {
        ResultModel<User> result = new ResultModel<>();
        User resultInfo =userService.findUserByUser(user);
        if (resultInfo != null ){
            result.setData(resultInfo);
        }else {
            result.setReturnMessage("查询为空");
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> updateUser(@RequestBody User user) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.updateUser(user);
        if (resultInfo == true ){
            result.setReturnMessage("更改状态成功");
            result.setData(true);
        }else {
            result.setReturnMessage("更改状态失败");
            result.setData(false);
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> addUser(@RequestBody User user) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultInfo =userService.addUser(user);
        if (resultInfo == true ){
            result.setReturnMessage("添加成功");
            result.setData(true);
        }else {
            result.setReturnMessage("添加失败");
            result.setData(false);
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();
    }

    @RequestMapping(value = "/getUserAll", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserAll( UserEvent userEvent) {
        ResultModel<PageInfo<User>> result = new ResultModel<>();
        int userCount = userService.findCountUser(userEvent);
        if (userCount != 0 ){
            List<User> resultInfo =userService.findUserAll(userEvent);
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

    @RequestMapping(value = "/removeUserById", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> removeUserById(@RequestBody List<Long> id) {
        ResultModel<Boolean> result = new ResultModel<>();
        boolean resultRemove = userService.removeUserById(id);
        if (resultRemove) {
            result.setReturnMessage("删除成功");
            result.setData(true);
        } else {
            result.setReturnMessage("删除失败");
            result.setData(false);
            result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
        }
        return result.dump();

    }
}
