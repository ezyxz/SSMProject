package com.xinyuan.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        UserDao user = (UserDao) app.getBean("getUserDaoAnno");
        user.run();

    }
}
