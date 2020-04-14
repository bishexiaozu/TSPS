package com.tsps.authority.controller;

import com.tsps.authority.dto.AddEmployeeDTO;
import com.tsps.authority.dto.ModifyEmployeeDTO;
import com.tsps.authority.service.EmployeeManageService;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/15：43
 *  * @description : 员工管理控制器
 *  * @modified :
 */
@RequestMapping("/employee_manage")
@Controller
public class EmployeeManageController {

    @Autowired
    private EmployeeManageService employeeManageService;

    @PostMapping("/getEmployeeList/{companyId}/{page}")
    @ResponseBody
    public ResultBean getEmployeeList(@PathVariable Integer companyId, @PathVariable Integer page){
        return employeeManageService.getEmployeeList(companyId,page);
    }

    @PostMapping("/getTotalEmployee/{companyId}")
    @ResponseBody
    public ResultBean getTotalEmployee(@PathVariable Integer companyId){
        return employeeManageService.getTotalEmployee(companyId);
    }

    @PostMapping("/addEmployee")
    @ResponseBody
    public ResultBean addEmployee(@RequestBody @Valid AddEmployeeDTO addEmployeeDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        }
        return employeeManageService.addEmployee(addEmployeeDTO);
    }

    @PostMapping("/deleteEmployee/{employeeId}")
    @ResponseBody
    public ResultBean deleteEmployee(@PathVariable Integer employeeId){
        return employeeManageService.deleteEmployee(employeeId);
    }

    @PostMapping("modifyEmployee")
    @ResponseBody
    public ResultBean modifyEmployee(@RequestBody @Valid ModifyEmployeeDTO modifyEmployeeDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
        return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);}
        return employeeManageService.modifyEmployee(modifyEmployeeDTO);
    }
}
