package com.lishengzhi_spring2.mapper.impl;

import com.lishengzhi_spring2.mapper.UserMapper;


public class UserMapperImpl implements UserMapper {


    @Override
    public void add() {
        System.out.println("UserMapperImpl方法add被调用");
    }
}
