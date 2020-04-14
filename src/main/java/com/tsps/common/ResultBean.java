package com.tsps.common;

import lombok.Data;


/**
 * @author : luxinnan
 * @date : 2020/4/10 12：04
 * @description : 返回包装类
 * @modified :
 */
@Data
public class ResultBean {

    //状态码
    private int status;

    //返回信息
    private String msg;

    //返回数据
    private Object data;

}
