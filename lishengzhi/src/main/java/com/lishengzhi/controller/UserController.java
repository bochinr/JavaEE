package com.lishengzhi.controller;

import com.lishengzhi.entity.User;
import com.lishengzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
    @RequestMapping("/findAll")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<User> all = userService.findAll();
        modelAndView.addObject("userList", all);
        modelAndView.setViewName("list.jsp");
        return modelAndView;
    }

    @RequestMapping("/login")
    @ResponseBody
    public void login(User user, HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        if("".equals(user.getUsername().trim()) && "".equals(user.getPassword().trim())){
            response.sendRedirect("/lishengzhi_war/login.jsp");
        } else {
            User u = userService.login(user);
            if (u != null){
                request.getRequestDispatcher("findAll").forward(request, response);
            } else {
                response.sendRedirect("/lishengzhi_war/login.jsp");
            }
        }
    }
    @RequestMapping("/deleteById")
    @ResponseBody
    public void deleteById(int id, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService.deleteById(id);
        request.getRequestDispatcher("findAll").forward(request,response);
    }
}
