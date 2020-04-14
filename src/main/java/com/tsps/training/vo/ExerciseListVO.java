package com.tsps.training.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/19:47
 *  * @description : 永豪试题列表返回类
 *  * @modified :
 */
@Data
public class ExerciseListVO implements Serializable {
    private static final long serialVersionUID = 1;
    private Integer id;
    private String content;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String answer;
    private String explain;
    private Integer score;
    private Date time;

}
