package com.fnzb.utils.event;

import java.util.Date;

public class CheckTaskApplyEvent extends PageEvent {
	/**
     * 审核表id
     */
    private Long checkStateId;
    /**
     * 审核人id
     */
    private Long checkStateUser;
    /**
     * 申请人id
     */
    private Long checkStateDoctor;
    /**
     * 申请时间
     */
    private Date checkStateTime;
    /**
     * 申请的考核任务id
     */
    private Long checkStateCheck;
    /**
     * 申请原因
     */
    private String checkStateReason;
    /**
     * 申请结果
     */
    private Byte isResult;
    /**
     * 审核确认时间
     */
    private Date ensureTime;



    public Long getCheckStateId() {
        return checkStateId;
    }

    public void setCheckStateId(Long checkStateId) {
        this.checkStateId = checkStateId;
    }

    public Long getCheckStateUser() {
        return checkStateUser;
    }

    public void setCheckStateUser(Long checkStateUser) {
        this.checkStateUser = checkStateUser;
    }

    public Long getCheckStateDoctor() {
        return checkStateDoctor;
    }

    public void setCheckStateDoctor(Long checkStateDoctor) {
        this.checkStateDoctor = checkStateDoctor;
    }

    public Date getCheckStateTime() {
        return checkStateTime;
    }

    public void setCheckStateTime(Date checkStateTime) {
        this.checkStateTime = checkStateTime;
    }

    public Long getCheckStateCheck() {
        return checkStateCheck;
    }

    public void setCheckStateCheck(Long checkStateCheck) {
        this.checkStateCheck = checkStateCheck;
    }

    public String getCheckStateReason() {
        return checkStateReason;
    }

    public void setCheckStateReason(String checkStateReason) {
        this.checkStateReason = checkStateReason == null ? null : checkStateReason.trim();
    }

    public Byte getIsResult() {
        return isResult;
    }

    public void setIsResult(Byte isResult) {
        this.isResult = isResult;
    }

    public Date getEnsureTime() {
        return ensureTime;
    }

    public void setEnsureTime(Date ensureTime) {
        this.ensureTime = ensureTime;
    }
}