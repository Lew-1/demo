package com.demo.lew;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author luzhonghe
 * @date 2022/6/9 2:13 PM
 */
public class ProxyFactory {
    
    public static Object getProxyInstance(Object obj) {
        ProxyInvocationHandler invocationHandler = new ProxyInvocationHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), invocationHandler);
    }
    
}
