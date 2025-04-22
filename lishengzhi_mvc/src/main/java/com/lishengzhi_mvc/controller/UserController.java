package com.lishengzhi_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/save1")
    public String save1(){
        return "success.jsp";
    }

    @RequestMapping("save2")
    public String save2() {
        return "save2";
    }
    @RequestMapping("/save3")
    public ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","李胜志");
        modelAndView.addObject("age","21");
        modelAndView.setViewName("save3.jsp");
        return modelAndView;
    }



}
