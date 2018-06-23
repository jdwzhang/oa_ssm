package com.zw.oa.dao;

import com.zw.oa.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UserDaoTest {
    private ApplicationContext context;
    private UserDao userDao;

    @BeforeMethod
    public void setUp() {
        context = new ClassPathXmlApplicationContext("config/spring-context.xml");
        userDao = context.getBean(UserDao.class);
    }

    @Test
    public void testGet() {
        String userNumber = "200802";
        User user = userDao.get(userNumber);
        System.out.printf("number:%s,name:%s,realName:%s,gender:%s,birth:%s",user.getUserNumber(), user.getUserName(),user.getRealName(),user.getGender(),user.getBirth());
    }
}