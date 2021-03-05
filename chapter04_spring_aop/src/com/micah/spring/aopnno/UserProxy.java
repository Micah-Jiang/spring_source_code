package com.micah.spring.aopnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author m.kong
 * @Date 2021/2/28 上午12:12
 * @Version 1.0
 * @Description 增强的类
 */
@Component
@Aspect     // 生成代理对象
public class UserProxy {

    /**
     * 相同切入点抽取
     */
    @Pointcut(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    public void pointCut(){

    }
    /**
     * 前置通知
     * @Before注解表示作为前置通知
     */
    @Order(3)
    @Before(value = "pointCut()")
    public void before(){
        System.out.println("before...");
    }

    /**
     * 后置通知（返回通知）
     */
    @AfterReturning(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing...");
    }

    /**
     *最终通知
     */
    @After(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    public void after(){
        System.out.println("after...");
    }

    /**
     * 环绕通知
     */
    @Around(value = "execution(* com.micah.spring.aopnno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前...");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }

}
