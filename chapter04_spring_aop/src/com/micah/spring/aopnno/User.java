package com.micah.spring.aopnno;

import org.springframework.stereotype.Component;

/**
 * @Author m.kong
 * @Date 2021/2/27 下午11:09
 * @Version 1.0
 * @Description 被增强的类
 */
@Component
public class User {
    /**
     * 前置通知
     */
    public void add(){
        System.out.println("add......");
    }
}
