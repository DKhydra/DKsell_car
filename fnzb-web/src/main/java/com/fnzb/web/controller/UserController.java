package com.fnzb.web.controller;

import com.aliyuncs.exceptions.ClientException;
import com.fnzb.dao.entity.User;
import com.fnzb.dao.entity.event.UserAddEvent;
import com.fnzb.dao.entity.event.UserEvent;
import com.fnzb.exception.XbaseError;
import com.fnzb.result.ResultModel;
import com.fnzb.service.UserService;
import com.fnzb.spring.util.PageInfo;
import com.fnzb.utils.SendMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

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
    public Map<String, Object> addUser(@RequestBody UserAddEvent userAddEvent, final HttpSession session) throws ClientException {
        ResultModel<Boolean> result = new ResultModel<>();
        // 根据输入手机获取session中是否存在 手机号
        String sessionInfo = (String) session.getAttribute(String.valueOf(userAddEvent.getMobile()));
        // 如果没有的 为用户第一次登录 进行发送验证功能
        if (sessionInfo == null) {
            // 把用户手机号存放 session 用来验证多次验证
            final String modile =String.valueOf(userAddEvent.getMobile());
            session.setAttribute(modile,userAddEvent.getMobile());
            try {
                //TimerTask实现5分钟后从session中删除checkCode
                final Timer timer=new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        session.removeAttribute(modile);
                        System.out.println("checkCode删除成功");
                        timer.cancel();
                    }
                },5*60*1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
           if (userAddEvent.getVerifyCode() == session.getAttribute("verifyCode")) {

               boolean resultInfo =userService.addUser(userAddEvent);
               if (resultInfo == true  ){
                   result.setReturnMessage("添加成功");
                   result.setReturnCode("000000");
               }else {
                   result.setReturnMessage("添加失败");
                   result.setReturnCode(XbaseError.FAIL_TO_ADD.getErrorCode());
               }
           }

        }else {
            result.setReturnMessage("验证码已发送");
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

    @RequestMapping(value = "/getVerifyCode", method = RequestMethod.GET)
    @ResponseBody
    public String getVerifyCode(@RequestBody UserAddEvent userAddEvent,final HttpSession session) throws ClientException{
        // 获取验证码
        final String verifyCode = String.valueOf(new Random().nextInt(899999) + 100000);
        // 发送短信
        SendMessage.sendSms(userAddEvent.getMobile(),verifyCode);

        session.setAttribute("verifyCode",verifyCode);
        try {
            //TimerTask实现1分钟后从session中删除verifyCode
            final Timer timer=new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    session.removeAttribute("verifyCode");
                    timer.cancel();
                }
            },1*60*1000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        return verifyCode;
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

    @RequestMapping(value = "/loginForPc", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> loginForPc(User user) {
        return null;
    }
}
