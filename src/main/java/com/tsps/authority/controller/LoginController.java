package com.tsps.authority.controller;

import com.tsps.authority.dto.LoginDTO;
import com.tsps.authority.service.LoginService;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author : luxinnan
 * @date : 2020/4/16 16:58
 * @description:
 * @modified :
 */

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping("/company")
    @ResponseBody
    public ResultBean companyLogin(@RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.companyLogin(loginDTO);
    }
    @PostMapping("/employee")
    @ResponseBody
    public ResultBean employeeLogin(@RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.employeeLogin(loginDTO);
    }
    @PostMapping("/driver")
    @ResponseBody
    public ResultBeanCode driverLogin(@RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return loginService.driverLogin(loginDTO);
    }
    @PostMapping("/regulator")
    @ResponseBody
    public ResultBean regulatorLogin(@RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.regulatorLogin(loginDTO);
    }
}
