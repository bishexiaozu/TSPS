package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/5/24 22:26
 * @description:
 * @modified :
 */
@Data
public class AssessmentDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "id不能为空")
    private Integer assessmentId;

    @NotNull(message = "企业id不能为空")
    private Integer companyId;

    private List<AssessmentItemDetailDTO> assessmentItemDetailDTOList;

}