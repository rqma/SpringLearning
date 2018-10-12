package com.adi.g_annotation_a_ioc;

import com.adi.user.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation_A_IOC {

    @Test
    public void demo2() throws Exception {
        String xmlPath= "config\\beans2.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService  userService= (UserService) applicationContext.getBean("userserviceId");
        userService.addUser();
    }

}