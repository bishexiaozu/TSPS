package com.tsps.authority.controller;

import com.tsps.authority.service.CompanyManageService;
import com.tsps.common.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/21：18
 *  * @description : 企业管理控制器
 *  * @modified :
 */

@RequestMapping("/company_information")
@Controller
public class CompanyManageController {

    @Autowired
    private CompanyManageService service;

    @GetMapping("/selectById/{id}")
    @ResponseBody
    public ResultBean selectById(@PathVariable Integer id){
        return service.getCompanyById(id);
    }

    @PostMapping("/deleteCompany/{id}")
    @ResponseBody
    public ResultBean deleteCompany(@PathVariable Integer id){
        return service.deleteCompany(id);
    }

    @PostMapping("/getCompanyList/{state}/{page}")
    @ResponseBody
    public ResultBean getCompanyList(@PathVariable String state,@PathVariable Integer page){
        return service.getCompanyList(state,page);
    }

    @PostMapping("/setCompanyState/{id}")
    @ResponseBody
    public ResultBean setCompanyState(@PathVariable Integer id){
        return service.setCompanyState(id);
    }

    @PostMapping("getTotalCompany/{state}")
    @ResponseBody
    public ResultBean getTotalCompany(@PathVariable String state){
        return service.getTotalCompany(state);
    }

}
