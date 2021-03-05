package com.micah.spring.bean;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午5:08
 * @Version 1.0
 */
public class Orders {
    private String oName;

    public Orders() {
        System.out.println("Step 1: 执行无参构造方法，创建bean实例");
    }

    public void setoName(String oName) {
        System.out.println("Step 2: 调用set方法设置属性值");
        this.oName = oName;
    }

    public void initMethod(){
        System.out.println("Step 3: 执行初始化的方法");
    }

    public void destroyMethod(){
        System.out.println("Step 5: 执行销毁的方法");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oName='" + oName + '\'' +
                '}';
    }
}
