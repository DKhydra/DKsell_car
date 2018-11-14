package com.fnzb.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Auction {
    private Long id;

    private String name;

    private Date auctionTime;

    private Long cityId;

    private String city;

    private String province;

    private Long provinceId;

    private String holdSite;

    private String trademark;

    private String type;

    private String numberPlate;

    private String colour;

    private BigDecimal displacement;

    private Byte gearBox;

    private String vinNo;

    private Date compulsoryInsurance;

    private String engineType;

    private Date annualSurveyTime;

    private Long keyNumber;

    private Date endTime;

    private Date vehicleTaxTime;

    private Integer plateNumber;

    private String remarks;

    private String proceduresPicture;

    private String vehiclePicture;

    private BigDecimal price;

    private Byte carType;

    private Date gmtCreate;

    private Date gmtModified;

    private Long auditing;

    private Byte isAuditing;

    private Integer browsingVolume;

    private Long auctionRange;

    private Byte isSuccess;

    private Byte mileage;

    private Byte carAge;

    private Byte fuelType;

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

    public Date getAuctionTime() {
        return auctionTime;
    }

    public void setAuctionTime(Date auctionTime) {
        this.auctionTime = auctionTime;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public Long getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public String getHoldSite() {
        return holdSite;
    }

    public void setHoldSite(String holdSite) {
        this.holdSite = holdSite == null ? null : holdSite.trim();
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate == null ? null : numberPlate.trim();
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour == null ? null : colour.trim();
    }

    public BigDecimal getDisplacement() {
        return displacement;
    }

    public void setDisplacement(BigDecimal displacement) {
        this.displacement = displacement;
    }

    public Byte getGearBox() {
        return gearBox;
    }

    public void setGearBox(Byte gearBox) {
        this.gearBox = gearBox;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo == null ? null : vinNo.trim();
    }

    public Date getCompulsoryInsurance() {
        return compulsoryInsurance;
    }

    public void setCompulsoryInsurance(Date compulsoryInsurance) {
        this.compulsoryInsurance = compulsoryInsurance;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType == null ? null : engineType.trim();
    }

    public Date getAnnualSurveyTime() {
        return annualSurveyTime;
    }

    public void setAnnualSurveyTime(Date annualSurveyTime) {
        this.annualSurveyTime = annualSurveyTime;
    }

    public Long getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(Long keyNumber) {
        this.keyNumber = keyNumber;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getVehicleTaxTime() {
        return vehicleTaxTime;
    }

    public void setVehicleTaxTime(Date vehicleTaxTime) {
        this.vehicleTaxTime = vehicleTaxTime;
    }

    public Integer getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(Integer plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getProceduresPicture() {
        return proceduresPicture;
    }

    public void setProceduresPicture(String proceduresPicture) {
        this.proceduresPicture = proceduresPicture == null ? null : proceduresPicture.trim();
    }

    public String getVehiclePicture() {
        return vehiclePicture;
    }

    public void setVehiclePicture(String vehiclePicture) {
        this.vehiclePicture = vehiclePicture == null ? null : vehiclePicture.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Byte getCarType() {
        return carType;
    }

    public void setCarType(Byte carType) {
        this.carType = carType;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Long getAuditing() {
        return auditing;
    }

    public void setAuditing(Long auditing) {
        this.auditing = auditing;
    }

    public Byte getIsAuditing() {
        return isAuditing;
    }

    public void setIsAuditing(Byte isAuditing) {
        this.isAuditing = isAuditing;
    }

    public Integer getBrowsingVolume() {
        return browsingVolume;
    }

    public void setBrowsingVolume(Integer browsingVolume) {
        this.browsingVolume = browsingVolume;
    }

    public Long getAuctionRange() {
        return auctionRange;
    }

    public void setAuctionRange(Long auctionRange) {
        this.auctionRange = auctionRange;
    }

    public Byte getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(Byte isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Byte getMileage() {
        return mileage;
    }

    public void setMileage(Byte mileage) {
        this.mileage = mileage;
    }

    public Byte getCarAge() {
        return carAge;
    }

    public void setCarAge(Byte carAge) {
        this.carAge = carAge;
    }

    public Byte getFuelType() {
        return fuelType;
    }

    public void setFuelType(Byte fuelType) {
        this.fuelType = fuelType;
    }
}