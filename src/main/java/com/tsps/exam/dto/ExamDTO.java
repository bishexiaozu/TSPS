package com.tsps.exam.dto;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/17：36
 *  *  * @description :考试接收类
 *  *  * @modified :
 */
@Data
public class ExamDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "驾驶员ID非空")
    private Integer driverId;
    @NotNull(message = "考试开始时间非空")
    private Timestamp beginTime;
    @NotNull(message = "考试结束时间非空")
    private Timestamp endTime;

    private Integer id;
}
