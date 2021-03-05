package com.micah.spring.collection;

import java.util.List;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午3:53
 * @Version 1.0
 */
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void show(){
        System.out.println(list);
    }
}
