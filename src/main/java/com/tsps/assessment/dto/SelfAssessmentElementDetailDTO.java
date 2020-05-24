package com.tsps.assessment.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/5/24 23:13
 * @description:
 * @modified :
 */
@Data
public class SelfAssessmentElementDetailDTO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer assessmentElementId;

    private Integer selfAssessmentScore;

}
