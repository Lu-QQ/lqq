package com.lqq.service;

import com.lqq.entity.UserEntity;
import com.lqq.vo.req.LoginReq;

public interface UserService {

        public UserEntity login(LoginReq loginReq);
}
