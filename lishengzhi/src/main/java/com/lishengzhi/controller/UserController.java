package com.lishengzhi.controller;

import com.lishengzhi.entity.User;
import com.lishengzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    @ResponseBody
    public String save(User user){
        userService.save(user);
        return "注册成功";
    }
}
