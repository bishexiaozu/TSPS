package com.tsps.assessment.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 11:34
 * @description:
 * @modified :
 */
@Data
public class AssessmentItemDetailVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer assessmentItemId;

    private String assessmentItemName;

    private Integer assessmentItemScore;

    private String selfAssessmentNote;

    private List<AssessmentElementDetailVO> assessmentElementDetailVOList;

}
