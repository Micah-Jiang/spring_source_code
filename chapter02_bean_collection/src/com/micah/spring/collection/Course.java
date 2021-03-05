package com.micah.spring.collection;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午3:44
 * @Version 1.0
 */
public class Course {
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
