package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/21 21:35
 * @description:
 * @modified :
 */
@Data
public class ListAssessmentDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "监管部门id不能为空")
    private Integer id;

    @NotNull(message = "考评状态不能为空")
    private Integer assessmentState;

    @NotNull(message = "当前页面不能为空")
    private Integer currentPage = 1;

    @NotNull(message = "每页多少条数据不能为空")
    private Integer pageSize = 5;

    private String companyFullName;

    private Integer beginIndex;

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        beginIndex = (currentPage - 1) * pageSize;
    }
}
