package com.lishengzhi.mapper;

import com.lishengzhi.entity.User;

import java.util.List;

public interface UserMapper {
    void add(User user);
//    void update(User user);
    void deleteById(int id);
    User findById(int id);

//    查询所有数据
    List<User> findAll();
//    条件查询
    List<User> findCondition(User user);
//    更新数据
    void updateById(User user);
//    单条件查询
    List<User> findBySingleCondition(User user);

    List<User> findByIds(List<Integer> ids);
}

