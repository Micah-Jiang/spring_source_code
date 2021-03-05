package com.micah.webflux.entity;

/**
 * @Author m.kong
 * @Date 2021/3/2 上午10:35
 * @Version 1.0
 */
public class User {
    /*可以使用lombok插件，就不需要设置set和get方法*/
    private String name;
    private String gender;
    private Integer age;

    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
