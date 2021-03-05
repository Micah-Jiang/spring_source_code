package com.micah.spring.service;

import com.micah.spring.dao.BookDao;
import com.micah.spring.enity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author m.kong
 * @Date 2021/2/28 下午9:19
 * @Version 1.0
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book){
        bookDao.add(book);
    }

    public void updateBook(Book book){
        bookDao.update(book);
    }

    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }

    public void selectCount(){
        int count = bookDao.selectCount();
        System.out.println(count);
    }

    public void batchAddBook(List<Object[]> books){
        bookDao.batchAddBook(books);
    }

    public void batchUpdateBook(List<Object[]> books) {
        bookDao.batchUpdateBook(books);
    }

    public void batchDelBook(List<Object[]> ids) {
        bookDao.batchDelBook(ids);
    }
}
