package com.adi.d_aspect_b;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* com.adi.d_aspect_b.UserServiceImpl.*(..))")
    private void mypoint(){}

   // @Before("execution(* com.adi.d_aspect_b.UserServiceImpl.*(..))")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println("前置通知" + joinPoint.getSignature().getName());
    }

   // @AfterReturning(value = "mypoint()",returning = "ret")
    public void myAfterReturning(JoinPoint joinPoint, Object ret) {
        System.out.println("后置通知" + "--" + joinPoint.getSignature().getName() + "--" + ret);
    }
    @AfterThrowing(value = "execution(* com.adi.d_aspect_b.UserServiceImpl.*(..))",throwing = "e")
    public void myAfterThrowing(JoinPoint joinPoint, Throwable e) {
        System.out.println("抛出异常" + "--" + joinPoint.getSignature().getName() + "--" + e.getMessage());

    }
   // @After("mypoint()")
    public void myAfter(JoinPoint joinPoint) {
        System.out.println("最终通知" + "--" + joinPoint.getSignature().getName());

    }
   // @Around("mypoint()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前");
        Object obj=pjp.proceed();
        System.out.println("环绕后");
        return pjp.proceed();
    }
}
