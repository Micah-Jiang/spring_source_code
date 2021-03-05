package com.micah.spring;

/**
 * @Author m.kong
 * @Date 2021/2/23 下午3:50
 * @Version 1.0
 */
public class Orders {
    private String oname;
    private String address;

    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void orderTest(){
        System.out.println(oname + "::" + address);
    }
}
