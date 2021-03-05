package com.micah.spring.testdemo;

import com.micah.spring.Book;
import com.micah.spring.Orders;
import com.micah.spring.User;
import com.micah.spring.bean.Employee;
import com.micah.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午1:32
 * @Version 1.0
 */
public class BeanTest {
    @Test
    public void testAdd() {
        // 1 加载 spring 配置文件
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        // 2 获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBookInsert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        book.testDemo();
        System.out.println(book);
    }

    @Test
    public void testOrderInsert(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        orders.orderTest();
        System.out.println(orders);
    }

    @Test
    public void testAdd2(){
         ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
         UserService userService = context.getBean("userService", UserService.class);
         System.out.println(userService);
         userService.add();
    }

    @Test
    public void testEmployee(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        employee.show();
    }

    /**
     * 级联赋值测试（1）
     */
    @Test
    public void testEmployee2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        employee.show();
    }
}

