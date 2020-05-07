package com.tsps.authority.controller;

import com.tsps.authority.dto.AddDriverDTO;
import com.tsps.authority.dto.ModifyDriverDTO;
import com.tsps.authority.service.DriverManageService;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @Author: luxinnan
 * @Date: 2020/5/6 23:15
 * @Discription:
 * @Modified:
 */
@RequestMapping("/driver_manage")
@Controller
public class DriverManageController {
    @Autowired
    private DriverManageService driverManageService;

    @PostMapping("/addDriver")
    @ResponseBody
    ResultBeanCode addDriver(@RequestBody@Valid AddDriverDTO addDriverDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return driverManageService.addDriver(addDriverDTO);
    }
    @PostMapping("/modifyDriver")
    @ResponseBody
    ResultBean modifyDriver(@RequestBody@Valid ModifyDriverDTO modifyDriverDTO,BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        return driverManageService.modifyDriver(modifyDriverDTO);
    }
    @PostMapping("/getCompany")
    @ResponseBody
    ResultBeanCode getCompany(){
        return driverManageService.getCompanyNameList();
    }
    @PostMapping("/deleteDriver/{id}")
    @ResponseBody
    ResultBean deleteDriver(@PathVariable Integer id){
        return driverManageService.deleteDriver(id);
    }
    @PostMapping("/getTotalNull/{companyId}")
    @ResponseBody
    ResultBean getTotalNull(@PathVariable Integer companyId){
        return driverManageService.getTotalDriver(companyId,1);
    }
    @PostMapping("/getTotalNotNull/{companyId}")
    @ResponseBody
    ResultBean getTotalNotNull(@PathVariable Integer companyId){
        return driverManageService.getTotalDriver(companyId,0);
    }
    @PostMapping("/getNullList/{companyId}/{page}")
    @ResponseBody
    ResultBean getNullList(@PathVariable Integer companyId,@PathVariable Integer page){
        return driverManageService.getDriverList(companyId,1,page);
    }
    @PostMapping("/getNotNullList/{companyId}/{page}")
    @ResponseBody
    ResultBean getNotNullList(@PathVariable Integer companyId,@PathVariable Integer page){
        return driverManageService.getDriverList(companyId,0,page);
    }

}
