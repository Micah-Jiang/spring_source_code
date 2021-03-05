package com.micah.spring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author m.kong
 * @Date 2021/2/27 下午4:31
 * @Version 1.0
 */
public class JDKProxy {

    public static void main(String[] args) {
        // 创建接口实现类代理对象
        Class[] interfaces = {UserDao.class};

        /*第三个参数传入匿名内部类
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return null;
            }
        });*/

        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int sum = dao.add(1, 8);
        System.out.println("sum = " + sum);
    }
}

/**
 * 创建代理对象
 */
class UserDaoProxy implements InvocationHandler{
    private Object obj;

    // 1、把创建的事谁的对象，就把谁传递过来
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    /**
     * 增强的逻辑
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 方法之前
        System.out.println("方法之前执行..." + method.getName() + ":传递的参数" + Arrays.toString(args));

        // 被增强的方法执行
        Object res = method.invoke(obj, args);

        // 方法之后
        System.out.println("方法之后执行" + obj);
        return res;
    }
}



