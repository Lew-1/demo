package com.demo.spring5.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author luzhonghe
 * @date 2022/6/9 4:14 PM
 */
@Component
public class User {
    
    public void add() {
        System.out.println("user add");
    }
    
}
