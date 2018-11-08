package com.fnzb.utils.event;

public class CheckAppEvent extends PageEvent{

    private String checkTitle;

    private Long ctpDoctor;

    private int isSure;

    private Long checkId;

    public Long getCheckId() {
        return checkId;
    }

    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }

    public int getIsSure() {
        return isSure;
    }

    public void setIsSure(int isSure) {
        this.isSure = isSure;
    }

    public String getCheckTitle() {
        return checkTitle;
    }

    public void setCheckTitle(String checkTitle) {
        this.checkTitle = checkTitle;
    }

    public Long getCtpDoctor() {
        return ctpDoctor;
    }

    public void setCtpDoctor(Long ctpDoctor) {
        this.ctpDoctor = ctpDoctor;
    }
}
