package com.tsps.content.entity;

import java.util.Date;

public class AssessmentFile {
    private Integer id;

    private String amtFileTitle;

    private String amtFilePath;

    private Date amtFileUploadTime;

    private Integer assessmentElementId;

    private Integer employeeId;

    private Integer companyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmtFileTitle() {
        return amtFileTitle;
    }

    public void setAmtFileTitle(String amtFileTitle) {
        this.amtFileTitle = amtFileTitle == null ? null : amtFileTitle.trim();
    }

    public String getAmtFilePath() {
        return amtFilePath;
    }

    public void setAmtFilePath(String amtFilePath) {
        this.amtFilePath = amtFilePath == null ? null : amtFilePath.trim();
    }

    public Date getAmtFileUploadTime() {
        return amtFileUploadTime;
    }

    public void setAmtFileUploadTime(Date amtFileUploadTime) {
        this.amtFileUploadTime = amtFileUploadTime;
    }

    public Integer getAssessmentElementId() {
        return assessmentElementId;
    }

    public void setAssessmentElementId(Integer assessmentElementId) {
        this.assessmentElementId = assessmentElementId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}