package com.demo.lew.practice;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author luzhonghe
 * @date 2022/6/9 10:17 AM
 */
public class ConstructorTest {
    
    // 调用构造函数
    @Test
    public void test1() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Javaer> javaerClass = Javaer.class;
        Constructor<Javaer> declaredConstructor = javaerClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Javaer hh = declaredConstructor.newInstance("hh");
        System.out.println(hh.getName());
    }
    
}
