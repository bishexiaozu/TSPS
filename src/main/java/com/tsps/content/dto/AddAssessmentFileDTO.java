package com.tsps.content.dto;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/21：39
 *  *  * @description :企业文件接收类
 *  *  * @modified :
 */
@Data
public class AddAssessmentFileDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "小项ID非空")
    private Integer elementId;

    @NotNull(message = "标题非空")
    private String title;

    @NotNull(message = "企业ID非空")
    private Integer companyId;
    @NotNull(message = "负责人ID非空")
    private Integer employeeId;

    @NotNull(message = "文件路径非空")
    private String path;



}
