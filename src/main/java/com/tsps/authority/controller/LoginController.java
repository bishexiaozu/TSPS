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
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    @CrossOrigin
    public ResultBean companyLogin(HttpServletRequest request, @RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.companyLogin(request, loginDTO);
    }
    @PostMapping("/employee")
    @ResponseBody
    public ResultBean employeeLogin(HttpServletRequest request, @RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.employeeLogin(request, loginDTO);
    }
    @PostMapping("/driver")
    @ResponseBody
    public ResultBeanCode driverLogin(HttpServletRequest request, @RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return loginService.driverLogin(request, loginDTO);
    }
    @PostMapping("/regulator")
    @ResponseBody
    public ResultBean regulatorLogin(HttpServletRequest request, @RequestBody @Valid LoginDTO loginDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return loginService.regulatorLogin(request, loginDTO);
    }
}
