package com.micah.spring.bean;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午1:50
 * @Version 1.0
 */
public class Department {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return dname;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
