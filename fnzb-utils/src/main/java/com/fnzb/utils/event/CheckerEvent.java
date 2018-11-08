package com.fnzb.utils.event;

public class CheckerEvent extends PageEvent {

    /**
     * 考核人姓名
     */
    private String checkerName;



    /**
     * 所属机构id 目前尚无用到
     */
    private Long checkerOrganization;

    public String getCheckerName() {
        return checkerName;
    }

    public void setCheckerName(String checkerName) {
        this.checkerName = checkerName;
    }

    public Long getCheckerOrganization() {
        return checkerOrganization;
    }

    public void setCheckerOrganization(Long checkerOrganization) {
        this.checkerOrganization = checkerOrganization;
    }
}
