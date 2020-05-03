package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 20:55
 * @description:
 * @modified :
 */
@Data
public class SelfAssessmentItemDetailDTO implements Serializable{

        private static final long serialVersionUID = 1;

        @NotNull(message = "考核项目id不能为空")
        private Integer assessmentItemId;

        @NotNull(message = "每项考核项目对应的考核要素自评情况不能为空")
        private List<SelfAssessmentElementDetailDTO> selfAssessmentElementDetailDTOList;

        private String selfAssessmentNote;

}
