package com.demo.lew.practice;

import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 泛型测试
 * @author luzhonghe
 * @date 2022/6/8 6:24 PM
 */
public class GenericTest {
    
    
    @Test
    public void test() {
        Class<Javaer> clazz = Javaer.class;
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass.getTypeName());
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class) actualTypeArguments[0]).getName());
    }
    
}
