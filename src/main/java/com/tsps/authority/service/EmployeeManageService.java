package com.tsps.authority.service;

import com.tsps.authority.dto.AddEmployeeDTO;
import com.tsps.authority.dto.ModifyEmployeeDTO;
import com.tsps.common.ResultBean;

/**
 * @author : luxinnan
 * @date : 2020/4/10/13:49
 * @description : 注册员工管理服务
 * @modified :
 */
public interface EmployeeManageService {

    //根据公司ID获取员工总人数
    ResultBean getTotalEmployee(Integer companyId);
    //根据公司ID、页数获取员工列表
    ResultBean getEmployeeList(Integer companyId, Integer Page);
    //修改员工信息
    ResultBean modifyEmployee(ModifyEmployeeDTO modifyEmployeeDTO);
    //根据员工ID删除员工
    ResultBean deleteEmployee(Integer employeeId);
    //新增员工
    ResultBean addEmployee(AddEmployeeDTO addEmployeeDTO);
}
