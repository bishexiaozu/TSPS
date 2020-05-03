package com.tsps.content.entity;

import java.io.Serializable;

public class AssessmentItem implements Serializable {
    private Integer id;

    private String assessmentItemName;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssessmentItemName() {
        return assessmentItemName;
    }

    public void setAssessmentItemName(String assessmentItemName) {
        this.assessmentItemName = assessmentItemName == null ? null : assessmentItemName.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}