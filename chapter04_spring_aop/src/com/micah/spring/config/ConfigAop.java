package com.micah.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author m.kong
 * @Date 2021/2/28 上午3:04
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = {"com.micah"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {

}
