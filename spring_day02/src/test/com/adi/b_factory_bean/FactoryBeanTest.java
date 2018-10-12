package com.adi.b_factory_bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public  class FactoryBeanTest {
    @Test
    public void demo1(){
        String xmlPath= "com\\adi\\b_factory_bean\\beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        //获得代理类
        UserService userService=(UserService)applicationContext.getBean("proxyServiceId");
        userService.addUser();
    }

}