package com.micah.spring.test;

import com.micah.spring.enity.User;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @Author m.kong
 * @Date 2021/3/1 下午4:17
 * @Version 1.0
 */
public class Log4jTest {
    private static final Logger log = LoggerFactory.getLogger(Log4jTest.class);

    @Test
    public void testLog4j(){
        log.info("hello log4j");
        log.debug("hello log4j world");
    }

    //函数式风格创建对象，交给 spring 进行管理
    @Test
    public void testGenericApplicationContext() {
        //1 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();
        //2 调用 context 的方法对象注册
        context.refresh();
        context.registerBean("user_one", User.class, User::new);
        //3 获取在 spring 注册的对象
        // User user = (User)context.getBean("com.micah.spring.enity.User");
        User user = (User)context.getBean("user_one");
        System.out.println(user);
    }

}
