package com.micah.spring;

/**
 * @Author m.kong
 * @Date 2021/2/27 下午5:04
 * @Version 1.0
 */
public class ApplicationTst {
    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        int add = userDao.add(1, 3);
        System.out.println(add);
    }
}
