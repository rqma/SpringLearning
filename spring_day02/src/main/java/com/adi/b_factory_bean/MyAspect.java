package com.adi.b_factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;

/**
 * @Description:切面类中确定通知。需要实现不同的接口。接口就是规范，从而就确定方法名称
 *              采用"环绕通知"
 * @Auther: Adi
 * @Date: 2018/10/4 13:50
 */
public class MyAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        System.out.println("前");
        //手动执行目标方法
        Object obj=mi.proceed();
        System.out.println("后");
        return obj;
    }


}
