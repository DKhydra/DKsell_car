package com.fnzb.utils.event;

import java.util.Date;

public class DoctorPatientsMappingEvent extends PageEvent {
    /**
     * 签约id
     */
    private Long id;
    /**
     * 签约医生id
     */
    private Long dpmDoctorId;
    /**
     * 签约患者
     */
    private Long dpmPatientId;
    /**
     * 是否在有效期
     */
    private int effectiveFlag;

    private Date gmtCreate;

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public int getEffectiveFlag() {
        return effectiveFlag;
    }

    public void setEffectiveFlag(int effectiveFlag) {
        this.effectiveFlag = effectiveFlag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDpmDoctorId() {
        return dpmDoctorId;
    }

    public void setDpmDoctorId(Long dpmDoctorId) {
        this.dpmDoctorId = dpmDoctorId;
    }

    public Long getDpmPatientId() {
        return dpmPatientId;
    }

    public void setDpmPatientId(Long dpmPatientId) {
        this.dpmPatientId = dpmPatientId;
    }
}
