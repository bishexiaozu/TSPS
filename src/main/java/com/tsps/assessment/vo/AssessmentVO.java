package com.tsps.assessment.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 11:32
 * @description:
 * @modified :
 */
@Data
public class AssessmentVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer assessmentId;

    private String assessmentTime;

    private List<AssessmentItemDetailVO> assessmentItemDetailVOList;

}
