package com.adi.g_annotation_c_other;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Description:
 * @Auther: Adi
 * @Date: 2018/9/27 11:07
 */
@Service("UserServiceId")
@Scope("prototype") //多例
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("add user");
    }
    @PostConstruct
    public void init(){
        System.out.println("init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy method");
    }
}
