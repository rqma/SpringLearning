package com.adi.d_aspect_a;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前哈" + joinPoint.getSignature().getName());
    }

    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后" + "--" + joinPoint.getSignature().getName() + "--" + ret);
    }

    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("抛异常" + "--" + joinPoint.getSignature().getName() + "--" + e.getMessage());

    }
    public void myAfter(JoinPoint joinPoint) {
        System.out.println("最终通知" + "--" + joinPoint.getSignature().getName());

    }

    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object obj=pjp.proceed();
        System.out.println("环绕后");
        return pjp.proceed();
    }
}
