package com.adi.a_proxy_b_cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description:jdk动态代理
 * @Auther: Adi
 * @Date: 2018/10/4 13:52
 */
public class MyBeanFactory {

    public static UserServiceImpl create() {
        //1.目标类
        final UserServiceImpl userservice = new UserServiceImpl();
        //2.切面类
        final MyAspect myAspect = new MyAspect();
        /**
          3.代理类

         */
         //3.1核心类
        Enhancer enhancer=new Enhancer();
        //3.2确定父类
        enhancer.setSuperclass(userservice.getClass());
        /**
         3.3  设置回调函数,MethodInterceptor接口等效于jdk invocationHandler接口
              intercept()等效于 jdk invoke
         */
        //
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                myAspect.before();
                Object o=method.invoke(userservice,args);
                //执行代理类的父类 (代理类与目标类时父子关系)
                //methodProxy.invoke(proxy,args);
                myAspect.after();
                return o;
            }
        });
        //3.4创建 代理
        UserServiceImpl proxyService= (UserServiceImpl) enhancer.create();
        return proxyService;
    }
}
