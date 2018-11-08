package com.fnzb.utils.event;

public class OrganizationEvent extends PageEvent {

    /**
     * 机构名称
     */
    private String organizationName;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
