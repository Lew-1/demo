package com.demo.lew;

/**
 * @author luzhonghe
 * @date 2022/6/9 2:12 PM
 */
public class Man implements People{
    @Override
    public String eat(String name) {
        System.out.println("man eat" + name);
        return name;
    }
}
