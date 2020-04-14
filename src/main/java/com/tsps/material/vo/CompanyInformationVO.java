package com.tsps.material.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/6 20:37
 * @description:
 * @modified :
 */
@Data
public class CompanyInformationVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer id;

    private String companyOperatingLicense;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date companyOperatingLicenseValidity;

    private String companyBusinessLicense;

//    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date companyBusinessLicenseValidity;

    private String companyNature;

    private String companyFullName;

    private String companyAbbreviation;

    private String companyContactPerson;

    private String companyContactMob;

    private String companyAddress;

    private String companyEmail;

    private String companySignaturePath;
}
