package com.demo.lew;

import org.junit.Test;

/**
 * @author luzhonghe
 * @date 2022/6/8 11:45 AM
 */
public class ClassLoadTest {
    
    @Test
    public void test() {
        // 对于自定义类，使用系统类加载器进行加载
        ClassLoader classLoader = ClassLoadTest.class.getClassLoader();
        System.out.println(classLoader);
        // 调用系统类加载器的 getParent() 获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        System.out.println(classLoader1);
        // 调用扩展类加载器的 getParent() 无法获取引导类加载器
        // 引导类加载器主要负责加载 java 的核心类库，无法加载自定义类
        ClassLoader classLoader2 = classLoader1.getParent();
        System.out.println(classLoader2);

        // 没有拿到 String 的类加载器，因为是引导类加载器，所以拿不到
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader3);

    }
    
}
