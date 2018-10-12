package com.adi.d_scope;

import com.adi.user.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestScope{

    @Test
    public void demo1(){
        String xmlPath= "config\\beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService1 = (UserService) applicationContext.getBean("UserServiceId_3");
        UserService userService2 = (UserService) applicationContext.getBean("UserServiceId_3");

        userService1.addUser();
        userService2.addUser();

        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println(userService1.hashCode());
        System.out.println(userService2.hashCode());
    }
    @Test
    public void demo2(){
        String xmlPath= "config\\beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService1 = (UserService) applicationContext.getBean("UserServiceId_4");
        UserService userService2 = (UserService) applicationContext.getBean("UserServiceId_4");

        userService1.addUser();
        userService2.addUser();

        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println(userService1.hashCode());
        System.out.println(userService2.hashCode());
    }
}