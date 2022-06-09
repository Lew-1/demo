package com.demo.lew;

import org.junit.Test;

/**
 * @author luzhonghe
 * @date 2022/6/9 2:30 PM
 */
public class ProxyTest {
    
    @Test
    public void test() {
        Man man = new Man();
        People proxyInstance = (People) ProxyFactory.getProxyInstance(man);
        proxyInstance.eat("秘制小汉堡");
    }
    
}
