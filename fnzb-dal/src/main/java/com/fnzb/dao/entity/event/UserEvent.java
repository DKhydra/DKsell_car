package com.fnzb.dao.entity.event;

import com.fnzb.utils.event.PageEvent;

/**
 * 用户分页类
 */
public class UserEvent extends PageEvent {

    private String realName;
    private String idNumber;
    private String email;
    private Long mobile;
    private String openId;
    private String nickName;
    private Byte isVerification;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
