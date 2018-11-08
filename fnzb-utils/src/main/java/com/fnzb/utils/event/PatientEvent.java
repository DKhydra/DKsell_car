package com.fnzb.utils.event;

public class PatientEvent extends PageEvent {
    /**
     * 病人姓名
     */
    private String patientName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
