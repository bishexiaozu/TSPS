package com.tsps.assessment.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/9 1:07
 * @description:
 * @modified :
 */
@Data
public class ListPreviousAssessmentDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "企业id不能为空")
    private Integer companyId;

    @NotNull(message = "页码")
    private Integer currentPage = 1;

    @NotNull(message = "每页多少")
    private Integer pageSize = 5;

    private Integer beginIndex;

    private Integer endIndex;

    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
        beginIndex = (currentPage - 1) * pageSize;
        endIndex = currentPage * pageSize;
    }

}
