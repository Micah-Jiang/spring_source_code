package com.micah.spring.testdemo;

import com.micah.spring.Book;
import com.micah.spring.Orders;
import com.micah.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author m.kong
 * @Date 2021/2/23 下午12:03
 * @Version 1.0
 */
public class Spring5Test {
    @Test
    public void testAdd(){
        // 1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        // 1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        Book book = context.getBean("book", Book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testBookByP(){
        // 1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        Book books = context.getBean("books", Book.class);

        System.out.println(books);
        books.testDemo();
    }

    @Test
    public void testOrders(){
        // 1、加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 2、获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.orderTest();
    }
}
