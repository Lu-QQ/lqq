package com.lqq.controller.service.impl;

import com.lqq.controller.service.UserController;
import com.lqq.service.UserService;
import com.lqq.vo.req.LoginReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

@RestController
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;
    @Override
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp) {
        return null;
    }
}
