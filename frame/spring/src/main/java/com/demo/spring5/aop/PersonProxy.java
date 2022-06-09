package com.demo.spring5.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author luzhonghe
 * @date 2022/6/9 6:29 PM
 */
@Component
@Aspect
//@Order(1)
public class PersonProxy {
    
    @Before(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void before() {
        System.out.println("person before");
    }

    @After(value = "execution(* com.demo.spring5.aop.User.add(..))")
    public void after() {
        System.out.println("person after");
    }
    
}
