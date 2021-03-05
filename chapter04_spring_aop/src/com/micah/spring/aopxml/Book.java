package com.micah.spring.aopxml;

import org.springframework.stereotype.Component;

/**
 * @Author m.kong
 * @Date 2021/2/28 上午2:51
 * @Version 1.0
 */
@Component
public class Book {
    public void buy(){
        System.out.println("buy...");
    }
}
