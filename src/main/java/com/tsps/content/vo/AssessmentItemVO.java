package com.tsps.content.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/22：37
 *  *  * @description : 大点返回类
 *  *  * @modified :
 */

@Data
public class AssessmentItemVO implements Serializable {
    private static final long serialVersionUID = 1;
    private Integer id;
    private String content;
}
