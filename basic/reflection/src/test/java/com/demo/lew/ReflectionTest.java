package com.demo.lew;

import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author luzhonghe
 * @date 2022/6/6 3:37 PM
 */
public class ReflectionTest {
    
    // 反射之前，对 person 的操作
    @Test
    public void test1() {
        // 1.创建对象
        Person p1 = new Person("Tom", 12);
        // 2.通过对象调用内部的属性和方法
        p1.age = 10;
        System.out.println(p1);
        p1.show();
        
        // 无法访问私有变量和方法
    }
    
    // 反射之后操作
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        // 通过反射创建对象
        Constructor constructor = clazz.getConstructor(String.class, int.class);
        Object tom = constructor.newInstance("tom", 12);
        System.out.println(tom);    // 调用的 Person 的 toString 方法
        Person p = (Person) tom;
        System.out.println(p);
        
        // 通过反射调用属性和方法
        // 调用属性
        Field age = clazz.getField("age");
        age.set(tom, 111);
        System.out.println(tom);
        // 调用方法
        Method show = clazz.getMethod("show");
        show.invoke(p);
        
        // 通过反射可以调用私有构造器、属性和方法
        System.out.println("*********调用私有**********");
        // 私有构造器
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class);
        constructor1.setAccessible(true);
        Person jerry = (Person) constructor1.newInstance("jerry");
        System.out.println(jerry);
        // 私有属性
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(jerry, "laoliu");
        System.out.println(jerry);
        // 私有方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        showNation.invoke(p, "China");

    }
    
    // 获取 Class 实例的方式
    @Test
    public void test3() throws ClassNotFoundException {
        // 一：调用运行时类的属性：.class
        Class<Person> clazz = Person.class; //加泛型可以在创建对象时不用强转
        System.out.println(clazz);
        // 二：通过运行时类的对象调用 getClass() 方法
        Person p1 = new Person();
        Class<? extends Person> clazz1 = p1.getClass();
        System.out.println(clazz1);
        // 三：调用 Class 的静态方法：forName  （常用）
        Class<?> clazz3 = Class.forName("com.demo.lew.Person");
        System.out.println(clazz3);
        // 四：使用类加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> clazz4 = classLoader.loadClass("com.demo.lew.Person");
        System.out.println(clazz4);
        // 加载到内存中的运行时类，会缓存一定时间，可以在这段时间通过不同的方式来获取
        System.out.println(clazz == clazz1);
        System.out.println(clazz == clazz3);
        System.out.println(clazz == clazz4);
    }

    // Class 实例可以是哪些结构
    @Test
    public void test4() {
        Class<Object> c1 = Object.class;
        Class<Comparable> c2 = Comparable.class;
        Class<String[]> aClass = String[].class;
        Class<int[][]> aClass1 = int[][].class;
        Class<ElementType> elementTypeClass = ElementType.class;
        Class<Override> overrideClass = Override.class;
        Class<Integer> integerClass = int.class;
        Class<Void> voidClass = void.class;
        Class<Class> classClass = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];
        double[] c = new double[10];
        Class aClass2 = a.getClass();
        Class bClass = b.getClass();
        Class cClass = c.getClass();
        // 数组元素类型与维度一样，就是同一个 Class
        System.out.println(aClass2 == bClass);
        System.out.println(aClass2 == cClass);
    }
    
}
