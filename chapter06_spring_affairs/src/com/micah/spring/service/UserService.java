package com.micah.spring.service;

import com.micah.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author m.kong
 * @Date 2021/3/1 上午11:24
 * @Version 1.0
 */
@Service
@Transactional(readOnly = false,timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ) // 事务注解，类上面或者里面的方法上添加注解
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 转账
     */
    public void accountMoney(){
        /*userDao.reduceMoney();

        // 模拟异常
        int i = 10 / 0;

        userDao.addMoney();*/

        /*
         如何解决异常？采用事务解决
         Step 1：开启事务
         Step 2：开启业务操作
         Step 3：没有发生异常，提交事务
         Step 4: 出现异常，则执行事务回滚
         */

        //try{
            // Step 1: 开启事务

            // Step 2：开启业务操作
            userDao.reduceMoney();


            // 模拟异常
            int i = 10 / 0;

            userDao.addMoney();
            // Step 3：没有发生异常，提交事务

        /*}catch (Exception e){
            // Step 4: 出现异常，则执行事务回滚
            e.printStackTrace();
        }*/

    }
}
