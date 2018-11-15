package com.fnzb.web.controller;

import com.fnzb.dao.entity.Login;
import com.fnzb.exception.XbaseError;
import com.fnzb.result.ResultModel;
import com.fnzb.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * 用户登录
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private LoginService loginService;

    /**
     * 登录
     * @param mobile
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> login(String mobile, String password){
        ResultModel result = new ResultModel<>();
        // 判断用户名，密码是否为空
        if(mobile == null || mobile.trim().length() == 0 || password == null || password.trim().length() == 0){
            result.setReturnMessage("用户名或密码为空");
            result.setReturnCode("error");
            return result.dump();
        }
        // 根据用户名查询并返回Id
        Long user_id = loginService.findIdByMobile(Long.valueOf(mobile));
        if(user_id == null){
            result.setReturnMessage("用户不存在");
            result.setReturnCode("error");
            return result.dump();
        }
        // 根据用户名，密码查询
        Login login = loginService.findByMobileAndPassword(Long.valueOf(mobile), password);
        if(login == null){
            result.setReturnMessage("失败");
            result.setReturnCode(XbaseError.USER_PASS_ERROR.getErrorCode());
        }else{
            result.setReturnMessage("成功");
            result.setReturnCode("success");
        }
        return result.dump();
    }
}