package com.fnzb.dao.entity.event;

import com.fnzb.utils.event.PageEvent;

/**
 * 用户分页类 手机号 身份证 真实姓名模糊匹配
 */
public class UserEvent extends PageEvent {

    private String realName;
    private String idNumber;
    private String email;
    private Long mobile;
    private String openId;
    private Byte isVerification;
    private String cityId;
    private String city;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Byte getIsVerification() {
        return isVerification;
    }

    public void setIsVerification(Byte isVerification) {
        this.isVerification = isVerification;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

}
