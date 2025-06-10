package com.lishengzhi.service;

import com.lishengzhi.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User login(User user);
    void deleteById(int id);
}