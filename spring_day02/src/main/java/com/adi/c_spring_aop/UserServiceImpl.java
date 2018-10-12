package com.adi.c_spring_aop;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 13:48
 */
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("c_spring_aop add user");
    }

    public void updateUser() {
        System.out.println("c_spring_aop update user");

    }

    public void deleteUser() {
        System.out.println("c_spring_aop delete user");

    }
}
