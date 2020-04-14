package com.tsps.training.entity;

public class Exercise {
    private Integer id;

    private String exerciseContent;

    private String exerciseOptiona;

    private String exerciseOptionb;

    private String exerciseOptionc;

    private String exerciseOptiond;

    private String exerciseAnswer;

    private String exerciseExplain;

    private Integer employeeId;

    private String exerciseUploadTime;

    private Integer companyId;

    private Integer score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExerciseContent() {
        return exerciseContent;
    }

    public void setExerciseContent(String exerciseContent) {
        this.exerciseContent = exerciseContent == null ? null : exerciseContent.trim();
    }

    public String getExerciseOptiona() {
        return exerciseOptiona;
    }

    public void setExerciseOptiona(String exerciseOptiona) {
        this.exerciseOptiona = exerciseOptiona == null ? null : exerciseOptiona.trim();
    }

    public String getExerciseOptionb() {
        return exerciseOptionb;
    }

    public void setExerciseOptionb(String exerciseOptionb) {
        this.exerciseOptionb = exerciseOptionb == null ? null : exerciseOptionb.trim();
    }

    public String getExerciseOptionc() {
        return exerciseOptionc;
    }

    public void setExerciseOptionc(String exerciseOptionc) {
        this.exerciseOptionc = exerciseOptionc == null ? null : exerciseOptionc.trim();
    }

    public String getExerciseOptiond() {
        return exerciseOptiond;
    }

    public void setExerciseOptiond(String exerciseOptiond) {
        this.exerciseOptiond = exerciseOptiond == null ? null : exerciseOptiond.trim();
    }

    public String getExerciseAnswer() {
        return exerciseAnswer;
    }

    public void setExerciseAnswer(String exerciseAnswer) {
        this.exerciseAnswer = exerciseAnswer == null ? null : exerciseAnswer.trim();
    }

    public String getExerciseExplain() {
        return exerciseExplain;
    }

    public void setExerciseExplain(String exerciseExplain) {
        this.exerciseExplain = exerciseExplain == null ? null : exerciseExplain.trim();
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getExerciseUploadTime() {
        return exerciseUploadTime;
    }

    public void setExerciseUploadTime(String exerciseUploadTime) {
        this.exerciseUploadTime = exerciseUploadTime;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}