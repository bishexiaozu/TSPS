package com.tsps.exam.entity;

import java.io.Serializable;

public class Exam implements Serializable {
    private Integer id;

    private String examBegin;

    private String examTime;

    private Integer driverId;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamBegin() {
        return examBegin;
    }

    public void setExamBegin(String examBegin) {
        this.examBegin = examBegin;
    }

    public String getExamTime() {
        return examTime;
    }

    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}