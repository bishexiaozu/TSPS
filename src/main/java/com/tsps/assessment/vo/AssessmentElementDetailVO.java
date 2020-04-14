package com.tsps.assessment.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 11:36
 * @description:
 * @modified :
 */
@Data
public class AssessmentElementDetailVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer assessmentElementId;

    private String assessmentElementName;

    private Integer score;

    private Integer selfAssessmentScore;

    private Integer assessmentScore;

}
