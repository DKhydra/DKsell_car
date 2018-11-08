package com.fnzb.utils.event;

/**
 * 考核分页类
 */
public class CheckEvent extends PageEvent {

    private Long id;
    /**
     * 考核标题
     */
    private String checkTitle;
    /**
     * 考核级别
     */
    private Integer checkRank;

    /**
     * 考核创建者id
     */

    private Long checkUserId;

    /**
     * 考核模式
     */
    private Integer pattern;

    /**
     * 完成度
     */
    private Double completeness;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCompleteness() {
        return completeness;
    }

    public void setCompleteness(Double completeness) {
        this.completeness = completeness;
    }

    public Integer getPattern() {
        return pattern;
    }

    public void setPattern(Integer pattern) {
        this.pattern = pattern;
    }

    public String getCheckTitle() {
        return checkTitle;
    }

    public void setCheckTitle(String checkTitle) {
        this.checkTitle = checkTitle;
    }

    public Integer getCheckRank() {
        return checkRank;
    }

    public void setCheckRank(Integer checkRank) {
        this.checkRank = checkRank;
    }

    public Long getCheckUserId() {
        return checkUserId;
    }

    public void setCheckUserId(Long checkUserId) {
        this.checkUserId = checkUserId;
    }

}
