package com.demo.lew.practice;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author luzhonghe
 * @date 2022/6/8 4:36 PM
 */
public class FieldTest {
    
    @Test
    public void test1() {
        Class<Javaer> clazz = Javaer.class;
        // 获取当前运行时类以及父类的所有 public 属性
        Field[] fields = clazz.getFields();
        for (Field f : fields) {
            System.out.println(f);
        }
        System.out.println();
        // 获取当前运行时类自己定义的所有属性（不包含父类）
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            System.out.println(f);
        }
        
    }
    
    // 获取属性的权限修饰符 数据类型 变量名
    @Test
    public void test2() {
        Class<Javaer> clazz = Javaer.class;
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field f : declaredFields) {
            // 权限修饰符
            int modifiers = f.getModifiers();
            System.out.print(Modifier.toString(modifiers) + "\t");
            // 数据类型
            Class<?> type = f.getType();
            System.out.print(type + "\t");
            // 变量名
            String name = f.getName();
            System.out.println(name);
        }
    }
    
    
}
