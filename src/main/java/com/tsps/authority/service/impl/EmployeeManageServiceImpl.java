package com.tsps.authority.service.impl;

import com.tsps.authority.dao.CompanyEmployeeMapper;
import com.tsps.authority.dto.AddEmployeeDTO;
import com.tsps.authority.dto.ModifyEmployeeDTO;
import com.tsps.authority.entity.CompanyEmployee;
import com.tsps.authority.entity.CompanyEmployeeExample;
import com.tsps.authority.service.EmployeeManageService;
import com.tsps.authority.vo.EmployeeListVO;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/15:43
 *  * @description : 实现员工管理服务
 *  * @modified :
 */

@Service
public class EmployeeManageServiceImpl implements EmployeeManageService {
    @Autowired
    private CompanyEmployeeMapper mapper;

    @Override
    public ResultBean getTotalEmployee(Integer companyId) {
        CompanyEmployeeExample example = new CompanyEmployeeExample();
        CompanyEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(companyId);
        Long count = mapper.countByExample(example);
        Integer totalEmployee = new Integer(count.intValue());
        if(totalEmployee.intValue()>=0)
            return ErrorStatusEnum.SUCCESS.toReturnValue(totalEmployee);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean getEmployeeList(Integer companyId, Integer page) {

        //处理页码
        page = (page - 1) * 10;

        //拿到原始的员工列表
        List<EmployeeListVO> list = mapper.getEmployeeList(companyId,page);

        //处理返回信息
        //如果为空，直接返回
        if(list.isEmpty()) {
            return ErrorStatusEnum.SUCCESS.toReturnValue();
        }
        //如果不为空，包装返回数据
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean modifyEmployee(ModifyEmployeeDTO modifyEmployeeDTO) {

        CompanyEmployee companyEmployee = new CompanyEmployee();
        companyEmployee.setState(modifyEmployeeDTO.getState());
        companyEmployee.setId(modifyEmployeeDTO.getId());
        companyEmployee.setEmployeeName(modifyEmployeeDTO.getName());
        companyEmployee.setDepartment(modifyEmployeeDTO.getDepartment());
        companyEmployee.setPosition(modifyEmployeeDTO.getPost());
        companyEmployee.setEmployeePwd(modifyEmployeeDTO.getPwd());
        int result = mapper.updateByPrimaryKeySelective(companyEmployee);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean deleteEmployee(Integer employeeId) {

        int result = mapper.deleteByPrimaryKey(employeeId);

        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean addEmployee(AddEmployeeDTO addEmployeeDTO) throws NoSuchAlgorithmException {
        CompanyEmployee companyEmployee = new CompanyEmployee();
        companyEmployee.setEmployeeAccount(addEmployeeDTO.getAccount());
        companyEmployee.setEmployeePwd(addEmployeeDTO.getPwd());
        companyEmployee.setPosition(addEmployeeDTO.getPost());
        companyEmployee.setDepartment(addEmployeeDTO.getDepartment());
        companyEmployee.setEmployeeName(addEmployeeDTO.getName());
        companyEmployee.setCompanyId(addEmployeeDTO.getCompanyId());
        companyEmployee.setState(addEmployeeDTO.getState());
        int result = mapper.insertSelective(companyEmployee);

        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }
}
