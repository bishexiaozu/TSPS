package com.tsps.register.controller;

import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.register.dto.CompanyRegisterDTO;
import com.tsps.material.service.CompanyInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/14 22:19
 * @description:
 * @modified :
 */
@Controller
public class RegisterController {

    @Autowired
    private CompanyInformationService companyInformationService;

    @PostMapping(value = "/companyRegister")
    @ResponseBody
    public ResultBean companyRegister(@RequestBody @Valid CompanyRegisterDTO companyRegisterDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.companyRegister(companyRegisterDTO);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

}
