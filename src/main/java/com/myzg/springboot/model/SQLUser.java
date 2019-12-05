package com.myzg.springboot.model;

public class SQLUser {

    private String user_name;
    private Integer user_id;
    private String user_password;
    private String user_authority;

    public SQLUser() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_authority() {
        return user_authority;
    }

    public void setUser_authority(String user_authority) {
        this.user_authority = user_authority;
    }

    @Override
    public String
    toString() {
        return "SQLUser{" +
                "user_name='" + user_name + '\'' +
                ", user_id=" + user_id +
                ", user_password='" + user_password + '\'' +
                ", user_authority='" + user_authority + '\'' +
                '}';
    }
}
