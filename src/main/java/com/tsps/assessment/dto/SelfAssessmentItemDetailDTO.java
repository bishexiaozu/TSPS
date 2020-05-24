package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/5/24 23:11
 * @description:
 * @modified :
 */
@Data
public class SelfAssessmentItemDetailDTO implements Serializable {

        private static final long serialVersionUID = 1;

        @NotNull(message = "考核要素id不能为空")
        private Integer assessmentItemId;

        @NotNull(message = "考核要素自评内容不能为空")
        private String selfAssessmentNote;

        private List<SelfAssessmentElementDetailDTO> selfAssessmentElementDetailDTOList;
}
