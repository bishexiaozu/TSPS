package com.tsps.register.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 19:44
 * @description:
 * @modified :
 */
@Data
public class CompanyRegisterDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotBlank(message = "企业全称不能为空")
    private String companyFullName;

    @NotBlank(message = "信用代码不能为空")
    private String companyCreditCode;

    @NotBlank(message = "企业性质(类型)不能为空")
    private String companyNature;

    @NotBlank(message = "行业类别不能为空")
    private String companyIndustry;

    @NotBlank(message = "身份证号不能为空")
    private String companyContactIdentityNumber;

    @NotBlank(message = "联系人姓名不能为空")
    private String companyContactPerson;

    @NotBlank(message = "联系人手机号不能为空")
    private String companyContactMob;

    @NotBlank(message = "固定电话号码不能为空")
    private String companyContactTel;

    @NotBlank(message = "密码不能为空")
    private String companyPwd;

    private String companyEmail;

    private String companyWebsite;

    @NotBlank(message = "省份不能为空")
    private String companyAddressProvince;

    @NotBlank(message = "市区不能为空")
    private String companyAddressCity;

    private String companyAddress;

    @NotBlank(message = "营业执照url不能为空")
    private String companyBusinessLicensePhotoPath;

    @NotBlank(message = "身份证正面url不能为空")
    private String companyContactIdentityPhotoFrontPath;

    @NotBlank(message = "身份证反面url不能为空")
    private String companyContactIdentityPhotoBackPath;


}
