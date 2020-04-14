package com.tsps.training.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/13:48
 *  * @description : 接受试题类
 *  * @modified :
 */
@Data
public class AddExerciseDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "内容非空")
    private String content;
    @NotNull(message = "选项A非空")
    private String optionA;
    @NotNull(message = "选项B非空")
    private String optionB;
    @NotNull(message = "选项C非空")
    private String optionC;
    @NotNull(message = "选项D非空")
    private String optionD;
    @NotNull(message = "答案非空")
    private String answer;
    @NotNull(message = "解释非空")
    private String explain;
    @NotNull(message = "员工ID非空")
    private Integer employeeId;
    @NotNull(message = "公司ID非空")
    private Integer companyId;
    @NotNull(message = "分数非空")
    private Integer score;

}
