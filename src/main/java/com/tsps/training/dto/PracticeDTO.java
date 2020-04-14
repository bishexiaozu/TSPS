package com.tsps.training.dto;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/17：36
 *  *  * @description :考试得分接收类
 *  *  * @modified :
 */
@Data
public class PracticeDTO implements Serializable {
    private static final long serialVersionUID = 1;

    private Integer examId;
    @NotNull(message = "驾驶员id非空")
    private Integer driverId;
    @NotNull(message = "试题id非空")
    private Integer exerciseId;
    @NotNull(message = "回答非空")
    private String answer;
    @NotNull(message = "collect=3")
    private String collect;
}
