package com.zw.test;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @program: oa_ssm
 * @description:
 * @author: zhang wei
 * @create: 2018-06-20 00:14
 **/
public class DataSourceTest {
    ApplicationContext context;

    @BeforeTest
    public void init() {
        context = new ClassPathXmlApplicationContext("config/spring-context.xml");
    }

    @Test
    public void testDs() {
        SqlSessionFactoryBean bean = context.getBean(SqlSessionFactoryBean.class);
        System.out.println(bean);
    }
}
