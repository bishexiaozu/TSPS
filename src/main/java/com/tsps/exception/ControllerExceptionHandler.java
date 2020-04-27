package com.tsps.exception;

import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/18 22:00
 * @description:
 * @modified :
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBean exception(Exception ex) {
        ex.printStackTrace();
        return ErrorStatusEnum.SYSTEM_ERROR.toReturnValue();
    }
}
