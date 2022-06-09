package com.demo.lew.practice;

/**
 * @author luzhonghe
 * @date 2022/6/8 4:27 PM
 */
@Good(value = "666")
public class Javaer extends Worker<String> implements Programming, Manager, Comparable<String>{

    private String name;
    int age;
    public int id;

    @Good("777")
    public Javaer() {
        
    }
    
    @Good("private")
    private Javaer(String name) {
        this.name = name;
    } 
    
    Javaer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public void manage() {
        System.out.println("manage");
    }

    @Override
    public void skill(String name) {
        System.out.println("skill:" + name);
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
    
    public void display() {
        System.out.println("display");
    }
    
    private void show(String name) {
        System.out.println("show " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public static String staticMethod(String name) {
        System.out.println("haha " + name);
        return name;
    }
}
