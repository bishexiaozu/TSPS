package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : luxinnan
 * @date : 2020/4/10 11:44
 * @description : 员工注册信息
 * @modified :
 */

@Data
public class AddEmployeeDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "公司id不能为空")
    private Integer companyId;

    @NotNull(message = "账号不能为空")
    private String account;

    @NotNull(message = "密码不能为空")
    private String pwd;

    @NotNull(message = "员工姓名不能为空")
    private String name;

    @NotNull(message = "岗位不能为空")
    private String post;

    @NotNull(message = "职位不能为空")
    private String department;

    @NotNull(message = "状态不能为空")
    private String state;


}
