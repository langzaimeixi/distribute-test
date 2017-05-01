package com.lilang.distribute.test.dal.model;

import java.util.Date;

public class CustomerDO {
    private Integer customerId;

    private String customerName;

    private String regAccount;

    private String phoneNo;

    private String identityNo;

    private String identityType;

    private String loginName;

    private String loginPassword;

    private Date createTime;

    private Date updateTime;

    public CustomerDO(Integer customerId, String customerName, String regAccount, String phoneNo, String identityNo, String identityType, String loginName, String loginPassword, Date createTime, Date updateTime) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.regAccount = regAccount;
        this.phoneNo = phoneNo;
        this.identityNo = identityNo;
        this.identityType = identityType;
        this.loginName = loginName;
        this.loginPassword = loginPassword;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomerDO{");
        sb.append("customerId=").append(customerId);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append(", regAccount='").append(regAccount).append('\'');
        sb.append(", phoneNo='").append(phoneNo).append('\'');
        sb.append(", identityNo='").append(identityNo).append('\'');
        sb.append(", identityType='").append(identityType).append('\'');
        sb.append(", loginName='").append(loginName).append('\'');
        sb.append(", loginPassword='").append(loginPassword).append('\'');
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append('}');
        return sb.toString();
    }

    public CustomerDO() {
        super();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getRegAccount() {
        return regAccount;
    }

    public void setRegAccount(String regAccount) {
        this.regAccount = regAccount == null ? null : regAccount.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(String identityNo) {
        this.identityNo = identityNo == null ? null : identityNo.trim();
    }

    public String getIdentityType() {
        return identityType;
    }

    public void setIdentityType(String identityType) {
        this.identityType = identityType == null ? null : identityType.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
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