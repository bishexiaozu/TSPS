package com.tsps.assessment.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/22 0:56
 * @description:
 * @modified :
 */
@Data
public class ListAssessmentVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer id;

    private String assessmentTime;

    private String assessmentItem;

    private Integer selfAssessmentTotalScore;

    private Integer assessmentTotalScore;

    private String companyFullName;

    @JsonIgnore
    private Date createTime;

}
