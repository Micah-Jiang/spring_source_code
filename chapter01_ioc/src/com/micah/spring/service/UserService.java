package com.micah.spring.service;

import com.micah.spring.dao.UserDao;

/**
 * @Author m.kong
 * @Date 2021/2/23 下午8:45
 * @Version 1.0
 */
public class UserService {

    // 创建UserDao的对象，并设置set()方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add...");

        // 1、原始方式：创建UserDao对象
        /*UserDao userDao = new UserDaoImpl();
        userDao.update(); */
    }
}
