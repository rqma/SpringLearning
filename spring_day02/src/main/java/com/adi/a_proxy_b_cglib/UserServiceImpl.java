package com.adi.a_proxy_b_cglib;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 13:48
 */
public class UserServiceImpl implements UserService {
    public void addUser() {
        System.out.println("cglib add user");
    }

    public void updateUser() {
        System.out.println("cglib update user");

    }

    public void deleteUser() {
        System.out.println("cglib delete user");

    }
}
