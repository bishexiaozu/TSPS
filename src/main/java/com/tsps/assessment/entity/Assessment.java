package com.tsps.assessment.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Assessment {

    private Integer id;

    private Integer companyId;

    private Integer assessmentStatus;

    private Integer selfAssessmentTotalScore;

    private Integer assessmentTotalScore;

    private Date createTime;

}