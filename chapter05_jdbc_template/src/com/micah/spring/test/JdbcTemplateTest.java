package com.micah.spring.test;

import com.micah.spring.enity.Book;
import com.micah.spring.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author m.kong
 * @Date 2021/2/28 下午9:41
 * @Version 1.0
 */
public class JdbcTemplateTest {
    /**
     * 单增
     */
    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId(1);
        book.setUsername("Micah");
        book.setUserStatus("online");
        bookService.addBook(book);
    }
    @Test
    public void testUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId(1);
        book.setUsername("Maruko");
        book.setUserStatus("onlines");
        bookService.updateBook(book);
    }
    @Test
    public void testDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.deleteBook("1");
    }
    @Test
    public void testCount(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.selectCount();
    }
    @Test
    public void testBatchAddBooks(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> books = new ArrayList<>();
        Object[] o1 = {"3", "java", "a"};
        Object[] o2 = {"5", "C", "b"};
        books.add(o1);
        books.add(o2);
        bookService.batchAddBook(books);
    }
    @Test
    public void testBatchUpdate(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> books = new ArrayList<>();
        Object[] o1 = {"3", "Micah", "3"};
        Object[] o2 = {"5", "Maruko", "5"};
        books.add(o1);
        books.add(o2);
        bookService.batchUpdateBook(books);
    }
    @Test
    public void testBatchDelete(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        List<Object[]> ids = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"5"};
        ids.add(o1);
        ids.add(o2);
        bookService.batchDelBook(ids);
    }
}
