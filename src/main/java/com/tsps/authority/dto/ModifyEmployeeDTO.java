package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : luxinnan
 * @date : 2020/4/10 13:59
 * @description : 员工修改信息
 * @modified :
 */

@Data
public class ModifyEmployeeDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "员工id不能为空")
    private Integer Id;

    @NotNull(message = "密码不能为空")
    private String pwd;

    @NotNull(message = "员工姓名不能为空")
    private String name;

    @NotNull(message = "岗位不能为空")
    private String post;

    @NotNull(message = "职位不能为空")
    private String department;

    @NotNull(message = "状态不能空")
    private String state;


}
