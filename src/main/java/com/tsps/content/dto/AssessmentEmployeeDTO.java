package com.tsps.content.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/21：55
 *  *  * @description :负责人接收类
 *  *  * @modified :
 */
@Data
public class AssessmentEmployeeDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "负责人ID非空")
    private Integer employeeId;
    @NotNull(message = "要素ID非空")
    private Integer itemId;
    @NotNull(message = "企业ID非空")
    private Integer companyId;
}
