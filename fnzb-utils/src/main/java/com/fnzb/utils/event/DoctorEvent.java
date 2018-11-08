package com.fnzb.utils.event;

public class DoctorEvent extends PageEvent {

    /**
     * 医生姓名
     */
    private String doctorName;


    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }


}
