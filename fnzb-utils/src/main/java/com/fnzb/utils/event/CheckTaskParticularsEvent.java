package com.fnzb.utils.event;
/**
 *  考核任务分页类
 */
public class CheckTaskParticularsEvent extends PageEvent {

    private Long checkId;

    public Long getCheckId() {
        return checkId;
    }

    public void setCheckId(Long checkId) {
        this.checkId = checkId;
    }
}
