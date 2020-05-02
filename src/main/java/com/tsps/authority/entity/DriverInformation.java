package com.tsps.authority.entity;

import java.io.Serializable;

public class DriverInformation implements Serializable {
    private Integer id;

    private String driverAccount;

    private String driverPwd;

    private String driverName;

    private String driverTel;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverAccount() {
        return driverAccount;
    }

    public void setDriverAccount(String driverAccount) {
        this.driverAccount = driverAccount == null ? null : driverAccount.trim();
    }

    public String getDriverPwd() {
        return driverPwd;
    }

    public void setDriverPwd(String driverPwd) {
        this.driverPwd = driverPwd == null ? null : driverPwd.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel == null ? null : driverTel.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}