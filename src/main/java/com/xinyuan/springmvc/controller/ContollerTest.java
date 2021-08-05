package com.xinyuan.springmvc.controller;


import com.xinyuan.springmvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class ContollerTest {
    @RequestMapping("/admin")
    public String handleRequest(HttpServletRequest arg0, HttpServletResponse arg1, Model model) throws Exception{
        String id = arg0.getParameter("id");
        System.out.println(id);
        model.addAttribute("msg", "Hello user "+ id);
        return "welcome";
    }
    @RequestMapping("/adminn")
    public String handleRequest1(@RequestParam(value = "user_id") Integer id,  Model model){
        System.out.println(id);
        model.addAttribute("msg", "Hello user "+ id);
        return "welcome";
    }
    @RequestMapping("/signin")
    public String sigin(){
        return "register";
    }
    @RequestMapping("/login")
    public String login(User user){
        System.out.println("user login ....");
        System.out.println(user.getId());
        System.out.println(user.getPassword());
        System.out.println(user.getUsername());
        return "success";
    }


//    @RequestMapping("/test")
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView m = new ModelAndView();
//        m.addObject("msg","第一个SpringMVC程序");
//        m.setViewName("/WEB-INF/jsp/welcome.jsp");
//        return m;
//    }
}
