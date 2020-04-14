package com.tsps.material.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 18:54
 * @description:
 * @modified :
 */
@Data
public class CompanyInformationDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "id不能为空")
    private Integer id;

    @NotBlank(message = "公司经营许可证号不能为空")
    private String companyOperatingLicense;

    @NotNull(message = "公司经营许可证号有效期不能为空")
    private Date companyOperatingLicenseValidity;

    @NotBlank(message = "企业工商营业执照号不能为空")
    private String companyBusinessLicense;

    @NotNull(message = "企业工商营业执照号有效期不能为空")
    private Date companyBusinessLicenseValidity;

    @NotBlank(message = "企业性质不能为空")
    private String companyNature;

    @NotBlank(message = "企业全称不能为空")
    private String companyFullName;

    @NotBlank(message = "企业简称不能为空")
    private String companyAbbreviation;

    @NotBlank(message = "企业联系人不能为空")
    private String companyContactPerson;

    @NotBlank(message = "企业联系人电话不能为空")
    private String companyContactMob;

    private String companyAddress;

    private String companyEmail;

    private String companySignaturePath;
}
