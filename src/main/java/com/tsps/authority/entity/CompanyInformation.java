package com.tsps.authority.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class CompanyInformation implements Serializable {
    private Integer id;

    private String companyAccount;

    private String companyPwd;

    private String companyFullName;

    private String companyAbbreviation;

    private String companyParentBody;

    private String companyContactPerson;

    private String companyContactTel;

    private String companyContactMob;

    private String companyContactIdentityNumber;

    private String companyContactIdentityPhotoBackPath;

    private String companyContactIdentityPhotoFrontPath;

    private String companyAddressProvince;

    private String companyAddressCity;

    private String companyAddressTown;

    private String companyAddress;

    private String companyWebsite;

    private String companyEmail;

    private String companyOperatingLicense;

    private Date companyOperatingLicenseValidity;

    private String companyBusinessLicense;

    private Date companyBusinessLicenseValidity;

    private String companyNature;

    private String companyIndustry;

    private String companySignaturePath;

    private String companyCreditCode;

    private String state;

    private String companyBusinessLicensePhotoPath;
}