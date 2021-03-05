package com.micah.spring.aopxml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author m.kong
 * @Date 2021/2/28 上午2:51
 * @Version 1.0
 */
@Component
@Aspect
public class BookProxy {
    @Before(value = "execution(* com.micah.spring.aopxml.Book.buy(..))")
    public void before(){
        System.out.println("before...");
    }
}
