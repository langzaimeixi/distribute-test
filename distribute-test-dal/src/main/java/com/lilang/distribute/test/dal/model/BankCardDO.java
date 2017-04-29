package com.lilang.distribute.test.dal.model;

import java.util.Date;

public class BankCardDO {
    private Integer cardId;

    private String cardType;

    private String bankShort;

    private String cardIndex;

    private String cardBin;

    private String customerId;

    private String belongArea;

    private String reserveTel;

    private String belongName;

    private Date expireDate;

    private String status;

    private Date createTime;

    private Date updateTime;

    public BankCardDO(Integer cardId, String cardType, String bankShort, String cardIndex, String cardBin, String customerId, String belongArea, String reserveTel, String belongName, Date expireDate, String status, Date createTime, Date updateTime) {
        this.cardId = cardId;
        this.cardType = cardType;
        this.bankShort = bankShort;
        this.cardIndex = cardIndex;
        this.cardBin = cardBin;
        this.customerId = customerId;
        this.belongArea = belongArea;
        this.reserveTel = reserveTel;
        this.belongName = belongName;
        this.expireDate = expireDate;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public BankCardDO() {
        super();
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getBankShort() {
        return bankShort;
    }

    public void setBankShort(String bankShort) {
        this.bankShort = bankShort == null ? null : bankShort.trim();
    }

    public String getCardIndex() {
        return cardIndex;
    }

    public void setCardIndex(String cardIndex) {
        this.cardIndex = cardIndex == null ? null : cardIndex.trim();
    }

    public String getCardBin() {
        return cardBin;
    }

    public void setCardBin(String cardBin) {
        this.cardBin = cardBin == null ? null : cardBin.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getBelongArea() {
        return belongArea;
    }

    public void setBelongArea(String belongArea) {
        this.belongArea = belongArea == null ? null : belongArea.trim();
    }

    public String getReserveTel() {
        return reserveTel;
    }

    public void setReserveTel(String reserveTel) {
        this.reserveTel = reserveTel == null ? null : reserveTel.trim();
    }

    public String getBelongName() {
        return belongName;
    }

    public void setBelongName(String belongName) {
        this.belongName = belongName == null ? null : belongName.trim();
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}