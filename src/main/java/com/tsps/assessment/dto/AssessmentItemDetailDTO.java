package com.tsps.assessment.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/5/24 22:29
 * @description:
 * @modified :
 */
@Data
public class AssessmentItemDetailDTO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer assessmentItemId;

    private List<AssessmentElementDetailDTO> assessmentElementDetailDTOList;

    private String assessmentNote;

}
