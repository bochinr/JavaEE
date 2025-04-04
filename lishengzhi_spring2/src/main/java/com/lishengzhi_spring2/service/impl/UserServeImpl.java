package com.lishengzhi_spring2.service.impl;


import com.lishengzhi_spring2.entity.Student;
import com.lishengzhi_spring2.mapper.UserMapper;
import com.lishengzhi_spring2.mapper.impl.UserMapperImpl;
import com.lishengzhi_spring2.service.UserServe;

import java.util.List;
import java.util.Map;

public class UserServeImpl implements UserServe {
    private String name;
    private int age;
    private List<String> stringList;
    private Map<String, Student> mapStudent;
    private UserMapper userMapper;
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setMapStudent(Map<String, Student> mapStudent) {
        this.mapStudent = mapStudent;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void add() {
        userMapper.add();
        System.out.println(name+":"+age);
        for(int i=0;i<stringList.size();i++){
            System.out.println(stringList.get(i));
        }
        System.out.println(mapStudent);
    }

}
