package com.fnzb.utils.event;

public class UserEvent extends PageEvent {
    /**
     * 用户名称
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
