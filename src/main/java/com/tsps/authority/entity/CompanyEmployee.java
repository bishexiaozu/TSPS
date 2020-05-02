package com.tsps.authority.entity;

import java.io.Serializable;

public class CompanyEmployee implements Serializable {
    private Integer id;

    private String employeeAccount;

    private String employeePwd;

    private String employeeName;

    private Integer companyId;

    private String state;

    private String department;

    private String position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeAccount() {
        return employeeAccount;
    }

    public void setEmployeeAccount(String employeeAccount) {
        this.employeeAccount = employeeAccount == null ? null : employeeAccount.trim();
    }

    public String getEmployeePwd() {
        return employeePwd;
    }

    public void setEmployeePwd(String employeePwd) {
        this.employeePwd = employeePwd == null ? null : employeePwd.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
}