package com.adi.a_ioc;
import com.adi.user.UserService;
import com.adi.user.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIoC {


    //之前开发
    @Test
    public void demo1(){
        UserService userService=new UserServiceImpl();
        userService.addUser();
    }
    @Test
    public void demo2(){
        //从spring容器获得
        //1.获得容器
        String xmlPath= "com/adi/b_di/beans.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
      //  2.获得内容--不需要自己new，都是从spring容器获得
        UserService userService = (UserService) applicationContext.getBean("UserServiceId_1");
        userService.addUser();
    }
}