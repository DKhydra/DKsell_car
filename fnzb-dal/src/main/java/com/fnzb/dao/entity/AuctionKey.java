package com.fnzb.dao.entity;

public class AuctionKey {
    private Long id;

    private String engineType;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }
}