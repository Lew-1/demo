package com.demo.spring5;

import com.demo.spring5.aop.AopConfig;
import com.demo.spring5.aop.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author luzhonghe
 * @date 2022/6/9 5:13 PM
 */
public class TestAop {
    
    
    @Test
    public void testAopAnnotation() {

//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.add();

    }
    
}
