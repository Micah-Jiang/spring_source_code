package com.micah.spring.bean;

/**
 * @Author m.kong
 * @Date 2021/2/24 下午1:51
 * @Version 1.0
 */
public class Employee {
    private String eName;
    private String gender;

    // 员工属于一个部门
    private Department department;

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void show(){
        System.out.println("eName:" + eName + ",department:" + department + ",gender" + gender);
    }
}
