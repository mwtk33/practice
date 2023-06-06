package com.example.test1.entity;

public class zhuce {
    private String username;
    private String password;

    public zhuce() {
    }

    public zhuce(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "zhuce{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
