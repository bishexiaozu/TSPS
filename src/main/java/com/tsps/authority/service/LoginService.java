package com.tsps.authority.service;

import com.tsps.authority.dto.LoginDTO;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;

/**
 * @author : luxinnan
 * @date : 2020/4/16 16:59
 * @description:
 * @modified :
 */
public interface LoginService {
    ResultBean companyLogin(LoginDTO loginDTO);
    ResultBean employeeLogin(LoginDTO loginDTO);
    ResultBeanCode driverLogin(LoginDTO loginDTO);
    ResultBean regulatorLogin(LoginDTO loginDTO);
}
