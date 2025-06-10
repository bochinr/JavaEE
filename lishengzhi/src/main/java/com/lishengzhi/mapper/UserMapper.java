package com.lishengzhi.mapper;

import com.lishengzhi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {

    //保存用户
    void save(User user);
    //查询所有用户数据
    List<User> findAll();

    User findByUsernameAndPassword(User user);
    void deleteById(int id);
}