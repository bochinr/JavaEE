package com.lishengzhi_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @RequestMapping("/save1")
    public String save1(){
        return "success.jsp";
    }
}
