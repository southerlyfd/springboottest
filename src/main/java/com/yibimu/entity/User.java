package com.yibimu.entity;

import java.util.Date;


/**
 * Created by admin on 2017/6/20.
 */
public class User {
    private int org_id; // 用户所在部门ID
    private Date create_date; // 用户创建时间
    private int user_id; // 用户ID
    private String user_name; // 用户姓名
    private int user_sex; // 用户性别 男-1；女-0
    private int user_age; // 用户年龄

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(int user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }
}
