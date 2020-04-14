package com.tsps.content.entity;

import java.util.Date;

public class GovernmentFile {
    private Integer id;

    private String govFileType;

    private String govFileTitle;

    private String govFilePath;

    private Date govFileUploadTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGovFileType() {
        return govFileType;
    }

    public void setGovFileType(String govFileType) {
        this.govFileType = govFileType == null ? null : govFileType.trim();
    }

    public String getGovFileTitle() {
        return govFileTitle;
    }

    public void setGovFileTitle(String govFileTitle) {
        this.govFileTitle = govFileTitle == null ? null : govFileTitle.trim();
    }

    public String getGovFilePath() {
        return govFilePath;
    }

    public void setGovFilePath(String govFilePath) {
        this.govFilePath = govFilePath == null ? null : govFilePath.trim();
    }

    public Date getGovFileUploadTime() {
        return govFileUploadTime;
    }

    public void setGovFileUploadTime(Date govFileUploadTime) {
        this.govFileUploadTime = govFileUploadTime;
    }
}