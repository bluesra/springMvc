package com.jss.ishare.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Jack Yang on 6/22/15.
 */
@Entity
@Table(name = "USER_INFO")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    String username;

    String password;

    String mobileNumber;

    //身份证号/营利事业登记证号
    String identityNumber;

    @ElementCollection
    List<String> identityPic;

    String qq;
    //todo: use enum
    String identityType;

    //用户类型：  发布广告/设备拥有者/（管理员） 普通页面隐藏
    //todo: use enum
    String userType;

    //行业属性下拉框
    String businessType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public List<String> getIdentityPic() {
        return identityPic;
    }

    public void setIdentityPic(List<String> identityPic) {
        this.identityPic = identityPic;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }
}
