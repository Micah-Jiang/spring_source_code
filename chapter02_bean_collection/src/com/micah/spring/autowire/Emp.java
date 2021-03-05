package com.micah.spring.autowire;

/**
 * @Author m.kong
 * @Date 2021/2/25 下午6:03
 * @Version 1.0
 */
public class Emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void test(){
        System.out.println(dept);
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
