package com.adi.c_inject_b_static_factory;
import com.adi.user.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestStaticFactory {

    @Test
    public void demo1(){
        UserService userService= MyBeanFactory.createUser();
        userService.addUser();
    }
    @Test
    public void demo2(){

        String xmlPath= "config\\beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("UserServiceId_2");
        userService.addUser();
    }
}