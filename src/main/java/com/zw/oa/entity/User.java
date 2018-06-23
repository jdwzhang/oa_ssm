package com.zw.oa.entity;

import java.io.Serializable;
import java.sql.Date;

/**
 * @program: oa_ssm
 * @description: 用户Entity
 * @author: zhang wei
 * @create: 2018-06-20 22:59
 **/
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    // 用户编号
    private String userNumber;
    // 用户登录名
    private String userName;
    // 用户密码
    private String password;
    // 用户真名
    private String realName;
    // 性别
    private String gender;
    // 生日
    private Date birth;
    // 部门号
    private String deptNumber;
    // 组号
    private String groupNumber;
    // 用户邮箱
    private String userEmail;
    // 用户手机
    private String userPhone;
    // 用户角色
    private String roleNumber;
    // 用户简历
    private String userResume;
    // 用户头像路径
    private String userImgPath;
    // 用户薪水
    private double userSalary;

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getRoleNumber() {
        return roleNumber;
    }

    public void setRoleNumber(String roleNumber) {
        this.roleNumber = roleNumber;
    }

    public String getUserResume() {
        return userResume;
    }

    public void setUserResume(String userResume) {
        this.userResume = userResume;
    }

    public String getUserImgPath() {
        return userImgPath;
    }

    public void setUserImgPath(String userImgPath) {
        this.userImgPath = userImgPath;
    }

    public double getUserSalary() {
        return userSalary;
    }

    public void setUserSalary(double userSalary) {
        this.userSalary = userSalary;
    }
}
