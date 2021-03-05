package com.micah.spring;

/**
 * @Author m.kong
 * @Date 2021/2/27 下午4:29
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a+b;
    }

    @Override
    public void update(String id) {
        System.out.println("update方法执行了" + id);
    }
}
