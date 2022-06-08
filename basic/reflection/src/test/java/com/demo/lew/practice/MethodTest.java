package com.demo.lew.practice;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * @author luzhonghe
 * @date 2022/6/8 4:51 PM
 */
public class MethodTest {
    
    // 方法的权限修饰符 返回值类型 方法名 每个参数的参数类型 抛出的异常 都可以通过反射获取到
    @Test
    public void test() {
        Class<Javaer> javaerClass = Javaer.class;
        // 获取当前运行时类与所有父类的 public 的方法
        Method[] methods = javaerClass.getMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
        System.out.println();
        // 获取当前运行时类中声明的所有方法（不包含父类）
        Method[] declaredMethods = javaerClass.getDeclaredMethods();
        for (Method m : declaredMethods) {
            System.out.println(m);
        }
    }
    
    
    
}
