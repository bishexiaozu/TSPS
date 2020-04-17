package com.tsps.common;

import lombok.Data;

/**
 * @author : luxinnan
 * @date : 2020/4/17 11:29
 * @description:
 * @modified :
 */
@Data
public class ResultBeanCode {
    //状态码
    private int code;

    //返回信息
    private String msg;

    //返回数据
    private Object data;
}
