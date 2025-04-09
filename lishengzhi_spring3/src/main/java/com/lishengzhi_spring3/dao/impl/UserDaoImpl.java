package com.lishengzhi_spring3.dao.impl;


import com.lishengzhi_spring3.dao.UserDao;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDaoImpl implements UserDao {


    @Override
    public void add() {
        System.out.println("UserDaoImpl的add方法被调用。。。。");
    }
}
