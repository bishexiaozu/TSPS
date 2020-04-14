package com.tsps.assessment.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 21:48
 * @description:
 * @modified :
 */
@Data
public class PreviousAssessmentVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer id;

    private String assessmentTime;

    private String assessmentItem;

    private Integer selfAssessmentTotalScore;

    private Integer assessmentTotalScore;

}
