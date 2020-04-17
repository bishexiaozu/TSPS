package com.tsps.authority.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/16 22:06
 * @description:
 * @modified :
 */
@Data
public class LoginDTO implements Serializable {
    private static final long serialVersionUID = 1;
    @NotNull(message = "账号非空")
    private String account;
    @NotNull(message = "密码非空")
    private String pwd;
}
