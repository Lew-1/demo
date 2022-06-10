package com.demo.spring5.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 可以通过该类代替 xml 配置
 * @author luzhonghe
 * @date 2022/6/10 10:33 AM
 */
@Configuration
@ComponentScan({"com.demo.spring5.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AopConfig {
}
