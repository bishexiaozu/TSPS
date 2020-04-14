package com.tsps.authority.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10 14:19
 *  * @description : 包装返回员工列表类
 *  * @modified :
 */

@Data
public class EmployeeListVO implements Serializable {
    private static final long serialVersionUID = 1;

    private Integer id;
    private String account;
    private String pwd;
    private String name;
    private String department;
    private String post;
    private String state;
}
