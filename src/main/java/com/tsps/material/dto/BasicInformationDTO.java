package com.tsps.material.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 0:47
 * @description:
 * @modified :
 */
@Data
public class BasicInformationDTO implements Serializable {

    private static final long serialVersionUID = 1;

    @NotNull(message = "id不能为空")
    private Integer id;

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
}
