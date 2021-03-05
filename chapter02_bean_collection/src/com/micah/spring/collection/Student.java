package com.micah.spring.collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午3:15
 * @Version 1.0
 */
public class Student {
    private String[] courses;
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void show(){
        System.out.println(Arrays.toString(courses) + list.toString() + map.toString() + set.toString() +courseList.toString());
    }
}
