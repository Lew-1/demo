package com.demo.spring5.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author luzhonghe
 * @date 2022/6/9 4:52 PM
 */
@Component
@Aspect
@Order(value = 1)
public class UserProxy {
    
    
    @Before(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void before() {
        System.out.println("before ");
    }

    @After(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void after() {
        System.out.println("after");
    }

    @AfterReturning(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void afterReturning() {
        System.out.println("after returning");
    }

    // 抽取切入点
    @Pointcut(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void pointCut() {
        
    }
    
    @AfterThrowing(value = "pointCut()")
    public void afterThrowing() {
        System.out.println("afterThrowing ");
    }
    
    
    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before");
        proceedingJoinPoint.proceed();
        System.out.println("around after");
    }
    
}
