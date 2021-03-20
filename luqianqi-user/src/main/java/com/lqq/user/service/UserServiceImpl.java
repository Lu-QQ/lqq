package com.lqq.user.service;

import com.lqq.entity.UserEntity;
import com.lqq.service.UserService;
import com.lqq.vo.req.LoginReq;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity login(LoginReq loginReq) {
        return null;
    }
}
