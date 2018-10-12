package com.adi.c_inject_c_factory;


import com.adi.user.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyBeanFactory {
    @Test
    public void demo1(){
        MyBeanFactory factory=new MyBeanFactory();
        UserService userService= factory.createUser();
        userService.addUser();
    }
    @Test
    public void demo2(){

        String xmlPath= "config\\beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("UserServiceId_3");
        userService.addUser();
    }
}