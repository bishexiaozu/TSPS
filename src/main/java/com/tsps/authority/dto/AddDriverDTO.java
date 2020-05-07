package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author: luxinnan
 * @Date: 2020/5/6 23:19
 * @Discription:
 * @Modified:
 */
@Data
public class AddDriverDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "电话号码非空")
    private String tel;
    @NotNull(message = "公司ID非空")
    private Integer companyID;
    @NotNull(message = "司机姓名非空")
    private String name;
    @NotNull(message = "密码非空")
    private String pwd;

}
