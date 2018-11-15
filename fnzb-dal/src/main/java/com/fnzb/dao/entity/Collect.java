package com.fnzb.dao.entity;

import java.io.Serializable;

public class Collect implements Serializable {
    private Long id;

    private Long userId;

    private Long autionId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAutionId() {
        return autionId;
    }

    public void setAutionId(Long autionId) {
        this.autionId = autionId;
    }
}