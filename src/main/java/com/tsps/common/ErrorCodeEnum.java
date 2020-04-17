package com.tsps.common;

import org.springframework.validation.BindingResult;

/**
 * @author : luxinnan
 * @date : 2020/4/10 14:09
 * @description:包装返回信息
 * @modified :
 */
public enum ErrorCodeEnum {

    FAIL(-1,"fail"),
    SUCCESS(0,"success"),

    FILE_IS_EMPTY(400,"文件不能为空，请选择文件"),

    ;

    private Integer code ;

    private String msg;

    ErrorCodeEnum(Integer code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    public ResultBeanCode toReturnValue(){
        ResultBeanCode resultBeanCode = new ResultBeanCode();
        resultBeanCode.setCode(this.code);
        resultBeanCode.setMsg(this.msg);
        return resultBeanCode;
    }

    public ResultBeanCode toReturnValue(Object data){
        ResultBeanCode resultBeanCode = new ResultBeanCode();
        resultBeanCode.setCode(this.code);
        resultBeanCode.setMsg(this.msg);
        resultBeanCode.setData(data);
        return resultBeanCode;
    }

    public ResultBeanCode toReturnValue(BindingResult bindingResult){
        ResultBeanCode resultBeanCode = new ResultBeanCode();
        resultBeanCode.setCode(this.code);
        resultBeanCode.setMsg(this.msg);
        resultBeanCode.setData(bindingResult.getAllErrors().get(0).getDefaultMessage());
        return resultBeanCode;
    }

    public String getMsg() {
        return this.msg;
    }
}