package com.micah.spring;

/**
 * @Author m.kong
 * @Date 2021/2/23 下午3:07
 * @Version 1.0
 */
public class Book {
    /**
     * 创建属性
     */
    private String bname;
    private String bauthor;

    /**
     * 创建对应的set方法
     */
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println(bname + "::" + bauthor );
    }
}
