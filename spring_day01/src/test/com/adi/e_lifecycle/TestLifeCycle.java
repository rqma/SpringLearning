package com.adi.e_lifecycle;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    @Test
    public void demo2() throws Exception {
        String xmlPath= "config\\beans.xml";
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
        UserService userService= (UserService) applicationContext.getBean("UserServiceId_5");
        userService.addUser();
        /**
         * 1.容器必须关闭，销毁方法才能执行
         * 2.必须是单例(scope="singleton")
         * 反射机制写法(没必要)
         * ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
         * applicationContext.getClass().getMethod("close").invoke(applicationContext);
         */

        applicationContext.close();
    }

}