package com.xinyuan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Controller("getUserDaoAnno")
public class UserDaoAnno implements UserDao{
    @Autowired
    private IdDao idDao;
    @Override
    public void run(){
        System.out.println("UserDaoAnno class running...");
        idDao.print();
    }
}
