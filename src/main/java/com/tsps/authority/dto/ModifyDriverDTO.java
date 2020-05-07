package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: luxinnan
 * @Date: 2020/5/6 23:36
 * @Discription:
 * @Modified:
 */

@Data
public class ModifyDriverDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "账号非空")
    private String account;
    @NotNull(message = "电话号码非空")
    private String tel;
    @NotNull(message = "公司ID非空")
    private Integer companyID;
    @NotNull(message = "司机姓名非空")
    private String name;
    @NotNull(message = "密码非空")
    private String pwd;
    @NotNull(message = "id非空")
    private Integer id;
}
