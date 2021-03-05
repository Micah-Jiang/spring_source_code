package com.micah.spring;

/**
 * @Author m.kong
 * @Date 2021/2/27 下午4:27
 * @Version 1.0
 */
public interface UserDao {
    /**
     * 2数相加
     */
    int add(int a, int b);

    /**
     *
     * @param id
     */
    void update(String id);
}
