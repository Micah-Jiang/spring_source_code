package com.micah.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author m.kong
 * @Date 2021/2/26 下午10:04
 * @Version 1.0
 */
@Repository(value = "userDaoImplOne")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add ... ");
    }
}
