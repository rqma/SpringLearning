package com.adi.e_lifecycle;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/9/27 11:07
 */
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("lifecycle add user");
    }
    public void init(){
        System.out.println("init method");
    }
    public void destroy(){
        System.out.println("destroy method");
    }
}
