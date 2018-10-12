package com.adi.c_spring_aop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class SpringAopTest {
    @Test
public void demo1(){
    String xmlPath= "com\\adi\\c_spring_aop\\beans.xml";
    ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
    //获得代理类
    UserService userService=(UserService)applicationContext.getBean("userServiceId");
    userService.addUser();
}

}