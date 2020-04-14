package com.tsps.assessment.entity;

import lombok.Data;

@Data
public class AssessmentDetail {
    private Integer id;

    private Integer assessmentId;

    private Integer assessmentItemId;

    private Integer assessmentElementId;

    private Integer selfAssessmentScore;

    private Integer assessmentScore;
}