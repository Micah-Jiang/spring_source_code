package com.micah.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author m.kong
 * @Date 2021/2/26 下午11:52
 * @Version 1.0
 */
@Configuration // 作为配置类，替代xml文件
@ComponentScan(basePackages =  {"com.micah"})
public class SpringConfig {

}
