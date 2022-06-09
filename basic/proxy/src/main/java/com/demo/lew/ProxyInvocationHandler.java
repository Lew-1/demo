package com.demo.lew;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author luzhonghe
 * @date 2022/6/9 2:26 PM
 */
public class ProxyInvocationHandler implements InvocationHandler {

    private Object obj;

    public ProxyInvocationHandler(Object obj) {
        this.obj = obj;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        
        System.out.println("前置处理");
        Object result = method.invoke(obj, args);
        System.out.println("后置处理");
        return result;
    }
}
