package com.fnzb.web.controller;

import com.fnzb.dao.entity.User;
import com.fnzb.exception.XbaseError;
import com.fnzb.result.ResultModel;
import com.fnzb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger("UserController");

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserList(Long id) {
        ResultModel<User> result = new ResultModel<>();

            User resuLtInfo =userService.selectByPrimaryKey(id);

            if (resuLtInfo != null ){
                result.setData(resuLtInfo);
            }else {
                result.setReturnMessage("查询为空");
                result.setReturnCode(XbaseError.SYS_DB_ERROR.getErrorCode());
            }

        return result.dump();
    }
}
