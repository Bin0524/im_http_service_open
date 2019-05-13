package com.qunar.qchat.model;

public class UserInfo {
    private String user_id;
    private String user_name;
    private String gender;
    private String mood;
    private String url;
    private String dep1;
    private String dep2;
    private String dep3;
    private String dep4;
    private String dep5;
    private String department;


    public UserInfo(String user_id, String dep1, String dep2, String dep3, String dep4, String dep5, String department) {
        this.user_id = user_id;
        this.dep1 = dep1;
        this.dep2 = dep2;
        this.dep3 = dep3;
        this.dep4 = dep4;
        this.dep5 = dep5;
        this.department = department;
    }

    public UserInfo(String user_id, String user_name, Integer gender, String mood, String url) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.gender = gender.toString();
        this.mood = mood;
        this.url = url;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getGender() {
        return gender;
    }

    public String getDep1() {
        return dep1;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMood() {
        return mood == null ? "" : mood;
    }

    public void setMood(String mood) {
        this.mood = (mood == null) ? "" : mood;
    }

    public String getUrl() {
        if(url == null) {
            if(this.gender.equals("2")) {
                return "https://qt.qunar.com/file/v2/download/perm/784bf8637e509d2c1e22794252c0d9c3.png";
            } else {
                return "https://qt.qunar.com/file/v2/download/perm/3ca05f2d92f6c0034ac9aee14d341fc7.png";
            }
        } else {
            return url;
        }
    }

    public void setUrl(String url) {
        this.url = (url == null) ? "" : url;
    }

}
