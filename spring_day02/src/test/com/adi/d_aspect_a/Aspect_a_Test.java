package com.adi.d_aspect_a;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Aspect_a_Test {
    @Test
    public void demo1() {
        String xmlPath = "com\\adi\\d_aspect_a\\beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //获得代理类
        UserService userService=(UserService)applicationContext.getBean("userServiceId");
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }
}