package com.adi.a_proxy_b_cglib;


import org.junit.Test;


public  class CglibTest {
    @Test
    public void demo1(){
        UserServiceImpl userService= MyBeanFactory.create();
        userService.addUser();
        userService.updateUser();
        userService.deleteUser();
    }

}