package com.demo.lew;

/**
 * @author luzhonghe
 * @date 2022/6/6 3:31 PM
 */
public class Person {
    
    private String name;
    public int age;

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

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    private Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    
    public void show() {
        System.out.println("hello I'm a person");
    }
    
    private String showNation(String nation) {
        System.out.println("hello, my nation is " + nation);
        return nation;
    }
}
