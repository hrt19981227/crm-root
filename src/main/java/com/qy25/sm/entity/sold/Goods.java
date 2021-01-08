package com.qy25.sm.entity.sold;

import java.util.Date;

public class Goods {
    private Long id;

    private Long storageId;

    private Long goodsCode;

    private String goodsName;

    private String goodsBrand;

    private String goodsCategory;

    private String goodsModel;

    private String goodsColor;

    private String goodsSupplier;

    private String goodsStatus;

    private String goodsTrace;

    private String returnConfig;

    private Boolean returnType;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStorageId() {
        return storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public Long getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(Long goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(String goodsBrand) {
        this.goodsBrand = goodsBrand == null ? null : goodsBrand.trim();
    }

    public String getGoodsCategory() {
        return goodsCategory;
    }

    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory == null ? null : goodsCategory.trim();
    }

    public String getGoodsModel() {
        return goodsModel;
    }

    public void setGoodsModel(String goodsModel) {
        this.goodsModel = goodsModel == null ? null : goodsModel.trim();
    }

    public String getGoodsColor() {
        return goodsColor;
    }

    public void setGoodsColor(String goodsColor) {
        this.goodsColor = goodsColor == null ? null : goodsColor.trim();
    }

    public String getGoodsSupplier() {
        return goodsSupplier;
    }

    public void setGoodsSupplier(String goodsSupplier) {
        this.goodsSupplier = goodsSupplier == null ? null : goodsSupplier.trim();
    }

    public String getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(String goodsStatus) {
        this.goodsStatus = goodsStatus == null ? null : goodsStatus.trim();
    }

    public String getGoodsTrace() {
        return goodsTrace;
    }

    public void setGoodsTrace(String goodsTrace) {
        this.goodsTrace = goodsTrace == null ? null : goodsTrace.trim();
    }

    public String getReturnConfig() {
        return returnConfig;
    }

    public void setReturnConfig(String returnConfig) {
        this.returnConfig = returnConfig == null ? null : returnConfig.trim();
    }

    public Boolean getReturnType() {
        return returnType;
    }

    public void setReturnType(Boolean returnType) {
        this.returnType = returnType;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }
}