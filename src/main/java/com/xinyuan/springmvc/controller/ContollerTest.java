package com.xinyuan.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class ContollerTest {
    @RequestMapping("/admin")
    public String handleRequest(HttpServletRequest arg0, HttpServletResponse arg1, Model model) throws Exception{
        model.addAttribute("msg", "Hello SpringMVC");
        return "welcome";

    }
//    @RequestMapping("/test")
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView m = new ModelAndView();
//        m.addObject("msg","第一个SpringMVC程序");
//        m.setViewName("/WEB-INF/jsp/welcome.jsp");
//        return m;
//    }
}
