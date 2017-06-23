package com.yibimu.entity;


/**
 * Created by admin on 2017/6/22.
 */
public class UserModel {
    private String org_id; // 用户所在部门ID
    private String create_date; // 用户创建时间
    private String user_id; // 用户ID
    private String user_name; // 用户姓名
    private String user_sex; // 用户性别 男-1；女-0
    private String user_age; // 用户年龄

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
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

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }
}
