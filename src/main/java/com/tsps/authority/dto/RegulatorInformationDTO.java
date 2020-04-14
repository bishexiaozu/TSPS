package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : luxinnan
 * @date : 2020/4/10 11:46
 * @description : 前端监管部门注册信息
 * @modified :
 */

@Data
public class RegulatorInformationDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "账号不为空")
    private String account;

    @NotNull(message = "密码不为空")
    private String pwd;

    @NotNull(message = "监管部门名称不为空")
    private String name;

    @NotNull(message = "电话号码不为空")
    private String tel;

    @NotNull(message = "手机号码不为空")
    private String mob;

    @NotNull(message = "省份不为空")
    private String province;

    @NotNull(message = "市区不为空")
    private String city;

    @NotNull(message = "县区不为空")
    private String town;

    private String address;

    private String website;

    private String email;



}
