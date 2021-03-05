package com.micah.spring.service;

import com.micah.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author m.kong
 * @Date 2021/2/25 下午11:16
 * @Version 1.0
 */
// value可以不写，默认是首字母小写的类名
@Service(value = "userService") //<bean id="userService" class=""/>
public class UserService {
    @Value(value = "Micah")
    private String name;

    /**
     * 定义dao类型属性，不需要添加set方法，添加注入属性注解
     * @Autowired : 根据类型注入
     * @Qualifier(value = "userDaoImplOne") : 和上面@Autowired一起配合使用
     */
    @Autowired
    @Qualifier(value = "userDaoImplOne")
    // @Resource 根据类型注入
    // @Resource(name = "userDaoImplOne") 根据名称注入
    private UserDao userDao;

    public void add(){
        System.out.println("add..." + name);
        userDao.add();
    }
}
