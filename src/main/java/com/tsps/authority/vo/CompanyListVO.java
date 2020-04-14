package com.tsps.authority.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10 21:01
 *  * @description : 包装返回企业列表类
 *  * @modified :
 */
@Data
public class CompanyListVO implements Serializable {
    private static final long serialVersionUID = 1;
    private Integer id;
    private String abbreviation;
}
