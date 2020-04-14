package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 17:29
 * @description:
 * @modified :
 */
@Data
public class QueryAssessmentDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "企业id不能为空")
    private Integer companyId;

    @NotNull(message = "自评/考评日期不能为空")
    private Date date;

}
