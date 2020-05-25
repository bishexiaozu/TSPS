package com.tsps.assessment.enums;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/27 20:43
 * @description:
 * @modified :
 */
public enum  AssessmentStatusEnum {

    SELF_ASSESSMENT(0,"已自评"),
    ASSESSMENT(1,"已考评"),
    APPLY_FOR_ASSESSMENT(2,"申请考评")
    ;

    private Integer status ;

    private String msg;

    AssessmentStatusEnum(Integer status, String msg) {
        this.msg = msg;
        this.status = status;
    }

    public Integer getStatus() {
        return this.status;
    }
}
