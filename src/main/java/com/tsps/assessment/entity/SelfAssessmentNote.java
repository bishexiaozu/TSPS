package com.tsps.assessment.entity;

import lombok.Data;

@Data
public class SelfAssessmentNote {
    private Integer id;

    private Integer assessmentId;

    private Integer assessmentItemId;

    private String selfAssessmentNote;

    private String assessmentNote;
}