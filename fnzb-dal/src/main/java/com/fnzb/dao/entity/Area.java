package com.fnzb.dao.entity;

public class Area {
    private Long id;

    private String name;

    private String pCode;

    private String code;

    private String grade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode == null ? null : pCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}