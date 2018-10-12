package com.adi.d_aspect_b;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 13:48
 */

@Service("userServiceId")
public class UserServiceImpl implements UserService {
    public String  addUser() {
        System.out.println("d_aspect_b add user");
        return "hello spring";
    }

    public void updateUser() {
        System.out.println("d_aspect_b update user");
       int temp=9/0;
    }

    public void deleteUser() {
        System.out.println("d_aspect_b delete user");

    }
}
