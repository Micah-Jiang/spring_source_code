package com.micah.spring.test;

import com.micah.spring.autowire.Emp;
import com.micah.spring.bean.Orders;
import com.micah.spring.collection.Book;
import com.micah.spring.collection.Course;
import com.micah.spring.collection.Student;
import com.micah.spring.facbean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午3:34
 * @Version 1.0
 */
public class CollectionBeanTest {
    @Test
    public void testBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
        student.show();
    }

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book2);
        book.show();
    }

    @Test
    public void testMyBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("Step 4: 获取创建的bean实例对象");
        System.out.println(orders);

        // 手动让实例销毁
        ((ClassPathXmlApplicationContext) context).close();
     }

     @Test
     public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.test();
     }
}
