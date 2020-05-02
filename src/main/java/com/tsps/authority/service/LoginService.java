package com.tsps.authority.service;

import com.tsps.authority.dto.LoginDTO;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : luxinnan
 * @date : 2020/4/16 16:59
 * @description:
 * @modified :
 */
public interface LoginService {
    ResultBean companyLogin(HttpServletRequest request, LoginDTO loginDTO);
    ResultBean employeeLogin(HttpServletRequest request, LoginDTO loginDTO);
    ResultBeanCode driverLogin(HttpServletRequest request, LoginDTO loginDTO);
    ResultBean regulatorLogin(HttpServletRequest request, LoginDTO loginDTO);
}
