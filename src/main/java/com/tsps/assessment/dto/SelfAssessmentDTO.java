package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 20:49
 * @description:
 * @modified :
 */
@Data
public class SelfAssessmentDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "id不能为空")
    private Integer assessmentId;

    @NotNull(message = "企业id不能为空")
    private Integer companyId;

    private Date selfAssessmentTime;

    private List<SelfAssessmentItemDetailDTO> selfAssessmentItemDetailDTOList;
}
