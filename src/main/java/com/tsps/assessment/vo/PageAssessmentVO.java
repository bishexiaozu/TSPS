package com.tsps.assessment.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/22 0:54
 * @description:
 * @modified :
 */
@Data
public class PageAssessmentVO implements Serializable {

    private static final long serialVersionUID = 1;

    private List<ListAssessmentVO> list;

    private Integer total;

}
