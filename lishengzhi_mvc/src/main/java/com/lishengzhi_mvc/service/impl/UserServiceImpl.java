package com.lishengzhi_mvc.service.impl;

import com.lishengzhi_mvc.mapper.UserMapper;
import com.lishengzhi_mvc.service.UserService;

public class UserServiceImpl implements UserService {
    private UserMapper userMapper;
    @Override
    public void save() {
        userMapper.save();
    }
}
