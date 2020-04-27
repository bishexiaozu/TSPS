package com.tsps.common;

import org.springframework.validation.BindingResult;

/**
 * @author : luxinnan
 * @date : 2020/4/10 14:09
 * @description:包装返回信息
 * @modified :
 */
public enum ErrorStatusEnum {

    SYSTEM_ERROR(2,"系统异常"),

    FAIL(404,"fail"),
    SUCCESS(200,"success"),

    FILE_IS_EMPTY(500,"文件不能为空，请选择文件"),
    FILE_TYPE_ERROR(501,"文件格式错误"),

    LAST_MONTH_ASSESSMENT_IS_EMPTY(600,"上月没有进行自评和考评"),
    ID_IS_EMPTY(601,"id不能为空")
    ;

    private Integer status ;

    private String msg;

    ErrorStatusEnum(Integer status, String msg) {
        this.msg = msg;
        this.status = status;
    }

    public ResultBean toReturnValue(){
        ResultBean resultBean = new ResultBean();
        resultBean.setStatus(this.status);
        resultBean.setMsg(this.msg);
        return resultBean;
    }

    public ResultBean toReturnValue(Object data){
        ResultBean resultBean = new ResultBean();
        resultBean.setStatus(this.status);
        resultBean.setMsg(this.msg);
        resultBean.setData(data);
        return resultBean;
    }

    public ResultBean toReturnValue(BindingResult bindingResult){
        ResultBean resultBean = new ResultBean();
        resultBean.setStatus(this.status);
        resultBean.setMsg(this.msg);
        resultBean.setData(bindingResult.getAllErrors().get(0).getDefaultMessage());
        return resultBean;
    }

    public String getMsg() {
        return this.msg;
    }
    }
