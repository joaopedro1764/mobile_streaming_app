package com.example.app_streaming;

public class User {

    private String userName;
    private String avatar_url;

    public String getAvatar_url() {
        return avatar_url;
    }

    public User(String name, String avatarUrl) {
        this.userName = name;
    }

    public String getUserName() {
        return userName;
    }
}
