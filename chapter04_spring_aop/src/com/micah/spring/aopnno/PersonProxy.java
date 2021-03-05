package com.micah.spring.aopnno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author m.kong
 * @Date 2021/2/28 上午2:44
 * @Version 1.0
 */
@Component
@Aspect
public class PersonProxy {
    @Before(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    @Order(1)
    public void before(){
        System.out.println("Person Before ... ");
    }
}
