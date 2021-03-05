package com.micah.spring.test;

import com.micah.spring.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author m.kong
 * @Date 2021/3/1 下午5:26
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)  // 单元测试
@ContextConfiguration("classpath:bean1.xml") // 加载配置文件
// 上述代码已经完成了相关对象的创建
public class J4Test {
    @Autowired
    private UserService userService;

    @Test
    public void testJ4() {
        userService.addUser();
    }
 }
