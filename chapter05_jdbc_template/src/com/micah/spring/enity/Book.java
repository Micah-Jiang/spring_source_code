package com.micah.spring.enity;

/**
 * @Author m.kong
 * @Date 2021/2/28 下午9:32
 * @Version 1.0
 */
public class Book {
    private int userId;
    private String username;
    private String userStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
}
