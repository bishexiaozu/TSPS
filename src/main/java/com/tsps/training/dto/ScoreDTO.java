package com.tsps.training.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/17：36
 *  *  * @description :考试得分接收类
 *  *  * @modified :
 */
@Data
public class ScoreDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "二十道题非空")
    private List<PracticeDTO> list;

}
