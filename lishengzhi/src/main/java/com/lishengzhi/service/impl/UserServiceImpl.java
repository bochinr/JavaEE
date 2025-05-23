package com.lishengzhi.service.impl;
import com.lishengzhi.entity.User;
import com.lishengzhi.mapper.UserMapper;
import com.lishengzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void save(User user) {
       userMapper.save(user);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
