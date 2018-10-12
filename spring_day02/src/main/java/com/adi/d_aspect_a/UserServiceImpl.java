package com.adi.d_aspect_a;

import jdk.nashorn.internal.ir.ReturnNode;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 13:48
 */
public class UserServiceImpl implements UserService {
    public String  addUser() {
        System.out.println("d_aspect_a add user");
        return "hello spring";
    }

    public void updateUser() {
        System.out.println("d_aspect_a update user");
       // int temp=9/0;
    }

    public void deleteUser() {
        System.out.println("d_aspect_a delete user");

    }
}
