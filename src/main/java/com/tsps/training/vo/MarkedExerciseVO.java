package com.tsps.training.vo;

import lombok.Data;

import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/19:48
 *  * @description : 错题、收藏题返回类
 *  * @modified :
 */
@Data
public class MarkedExerciseVO implements Serializable {
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

    private String practiceAnswer;
    private String practiceState;
    private String practiceCollect;
}