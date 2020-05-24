package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 20:59
 * @description:
 * @modified :
 */
@Data
public class AssessmentElementDetailDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "考核要素id不能为空")
    private Integer assessmentElementId;

    @NotNull(message = "考核要考评得分不能为空")
    private Integer assessmentScore;

}
