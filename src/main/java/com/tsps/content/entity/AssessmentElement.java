package com.tsps.content.entity;

public class AssessmentElement {


    private Integer id;

    private String assessmentElementName;

    private Integer score;

    private Integer assessmentItemId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssessmentElementName() {
        return assessmentElementName;
    }

    public void setAssessmentElementName(String assessmentElementName) {
        this.assessmentElementName = assessmentElementName == null ? null : assessmentElementName.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getAssessmentItemId() {
        return assessmentItemId;
    }

    public void setAssessmentItemId(Integer assessmentItemId) {
        this.assessmentItemId = assessmentItemId;
    }
}