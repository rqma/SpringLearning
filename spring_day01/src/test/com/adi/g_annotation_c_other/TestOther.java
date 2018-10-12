package com.adi.g_annotation_c_other;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOther {
    @Test
    public void demo(){
        String xmlPath= "com\\adi\\g_annotation_c_other\\beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService1 = (UserService) applicationContext.getBean("UserServiceId");
        UserService userService2 = (UserService) applicationContext.getBean("UserServiceId");

        userService1.addUser();
        userService2.addUser();

        System.out.println(userService1);
        System.out.println(userService2);

        System.out.println(userService1.hashCode());
        System.out.println(userService2.hashCode());
        applicationContext.close();
    }

}