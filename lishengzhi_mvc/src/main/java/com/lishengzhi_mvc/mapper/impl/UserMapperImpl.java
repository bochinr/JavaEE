package com.lishengzhi_mvc.mapper.impl;

import com.lishengzhi_mvc.mapper.UserMapper;

public class UserMapperImpl implements UserMapper {
    @Override
    public void save() {
        System.out.println("UserMapperImpl方法save被调用");
    }
}
