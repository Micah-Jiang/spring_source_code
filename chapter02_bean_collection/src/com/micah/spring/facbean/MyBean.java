package com.micah.spring.facbean;

import com.micah.spring.collection.Course;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.swing.*;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午4:15
 * @Version 1.0
 */
public class MyBean implements FactoryBean<Course> {

    /**
     * 定义返回bean
     */
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}


