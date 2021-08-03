package com.xinyuan.sm.test;

import com.xinyuan.sm.pojo.User;
import com.xinyuan.sm.pojo.UserDao;
import com.xinyuan.sm.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class run {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("sm/applicationContext.xml");
        UserDao mapper = (UserDao) app.getBean("userMapper");
        User user = mapper.getUserById(1);
        System.out.println(user);
    }
}
