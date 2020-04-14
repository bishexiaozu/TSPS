package com.tsps.material.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/5 18:11
 * @description:
 * @modified :
 */
@Data
public class BasicInformationVO implements Serializable {

    private static final long serialVersionUID = 1;

    private Integer id;

    private String companyFullName;

    private String companyAbbreviation;

    private String companyContactPerson;

    private String companyContactMob;

    private String companyAddress;

    private String companyEmail;
}
