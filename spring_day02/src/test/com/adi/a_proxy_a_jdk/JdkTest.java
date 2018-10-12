package com.adi.a_proxy_a_jdk;

import org.junit.Test;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 14:00
 */
public class JdkTest {

    @Test
    public void demo1(){
        UserService userService=MyBeanFactory.create();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

}
