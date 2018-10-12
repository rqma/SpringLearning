package com.adi.c_inject_b_static_factory;

import com.adi.user.UserService;
import com.adi.user.UserServiceImpl;

/**
 * @Description:创建实例
 * @Auther: Adi
 * @Date: 2018/9/29 20:18
 */
public class MyBeanFactory {
    public static UserService createUser(){
        System.out.println("static create");
        return new UserServiceImpl();
    }
}
