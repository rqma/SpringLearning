package com.adi.a_proxy_b_cglib;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/10/4 13:50
 */
public class MyAspect {
    public void before(){
        System.out.println("鸡头");
    }
    public void after(){
        System.out.println("牛后");
    }
}
