package com.lqq.controller.service;

import com.lqq.vo.req.LoginReq;

import javax.servlet.http.HttpServletResponse;
import javax.xml.transform.Result;

public interface UserController {
    public Result login(LoginReq loginReq, HttpServletResponse httpRsp);
}
