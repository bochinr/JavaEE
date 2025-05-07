package com.lishengzhi_mvc.controller;


import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lishengzhi_mvc.entity.User;
import com.lishengzhi_mvc.entity.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        modelAndView.addObject("classRoom","计算机应用工程2班");
        modelAndView.addObject("number","2210180232");
        modelAndView.setViewName("save3.jsp");
        return modelAndView;
    }
    @RequestMapping("/save4")
    public void save4(HttpServletResponse response) throws IOException {
        response.getWriter().print("save4().....");
    }
    @RequestMapping("/save5")
    @ResponseBody
    public String save5() {
        return "save5()...";
    }
    @RequestMapping("/save6")
    @ResponseBody
    public String save6() {
        return "{\"username\":\"李胜志\",\"age\":\"20\"}";
    }
    @RequestMapping("/save7")
    @ResponseBody
    public String save7() throws JsonProcessingException {
        User user = new User();
        user.setId(1);
        user.setUsername("李胜志");
        user.setAge("20");
        user.setClassroom("计算机应用工程2班");
        user.setNumber("2210180232");
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }
    @RequestMapping("/save8")
    @ResponseBody
    public String save8(String username, int age) {
        System.out.println(username + age);
        return username + age;
    }
    @RequestMapping("/save9")
    @ResponseBody
    public User save9(User user) {
        System.out.println(user);
        return user;
    }
    @RequestMapping("/save10")
    @ResponseBody
    public void save10(String[] str) {
        System.out.println(str);
    }

    @RequestMapping("/save11")
    @ResponseBody
    public void save11(VO vo) {
        List<User> list = vo.getList();
        for (int i = 0;i < list.size();i++) {
            User user = list.get(i);
            System.out.println(user);
        }
    }

    @RequestMapping("/save12")
    @ResponseBody
    public List<User> save12(@RequestBody List<User> list) {
        return list;
    }


}
