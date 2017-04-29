package com.lilang.distribute.test.dal.model;

import java.util.Date;

public class AuthDO {
    private Integer id;

    private String authType;

    private String customerId;

    private String customerName;

    private String status;

    private String authEntityNo;

    private Date createTime;

    private Date updateTime;

    public AuthDO(Integer id, String authType, String customerId, String customerName, String status, String authEntityNo, Date createTime, Date updateTime) {
        this.id = id;
        this.authType = authType;
        this.customerId = customerId;
        this.customerName = customerName;
        this.status = status;
        this.authEntityNo = authEntityNo;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public AuthDO() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType == null ? null : authType.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAuthEntityNo() {
        return authEntityNo;
    }

    public void setAuthEntityNo(String authEntityNo) {
        this.authEntityNo = authEntityNo == null ? null : authEntityNo.trim();
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