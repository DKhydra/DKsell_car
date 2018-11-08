package com.fnzb.utils.event;

public class CheckQuestionEvent extends PageEvent {

    private Long checkId;

    public Long getCheckId() {
        return checkId;
    }

    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }
}
