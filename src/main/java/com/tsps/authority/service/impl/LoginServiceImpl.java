package com.tsps.authority.service.impl;

import com.tsps.authority.dao.CompanyEmployeeMapper;
import com.tsps.authority.dao.CompanyInformationMapper;
import com.tsps.authority.dao.DriverInformationMapper;
import com.tsps.authority.dao.RegulatorInformationMapper;
import com.tsps.authority.dto.LoginDTO;
import com.tsps.authority.entity.*;
import com.tsps.authority.service.LoginService;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : luxinnan
 * @date : 2020/4/16 17:02
 * @description:
 * @modified :
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    CompanyEmployeeMapper companyEmployeeMapper;
    @Autowired
    CompanyInformationMapper companyInformationMapper;
    @Autowired
    DriverInformationMapper driverInformationMapper;
    @Autowired
    RegulatorInformationMapper regulatorInformationMapper;

    @Override
    public ResultBean companyLogin(LoginDTO loginDTO) {
        CompanyInformationExample example = new CompanyInformationExample();
        CompanyInformationExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyAccountEqualTo(loginDTO.getAccount());
        criteria.andCompanyPwdEqualTo(loginDTO.getPwd());
        List<CompanyInformation> result = companyInformationMapper.selectByExample(example);
        if(result.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue("账号或密码错误");
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean employeeLogin(LoginDTO loginDTO) {
        CompanyEmployeeExample employeeExample = new CompanyEmployeeExample();
        CompanyEmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmployeeAccountEqualTo(loginDTO.getAccount());
        criteria.andEmployeePwdEqualTo(loginDTO.getPwd());
        List<CompanyEmployee> result = companyEmployeeMapper.selectByExample(employeeExample);
        if(result.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue("账号或密码错误");
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBeanCode driverLogin(LoginDTO loginDTO) {
        String account = loginDTO.getAccount();
        String pwd = loginDTO.getPwd();
        List<DriverInformation> result = driverInformationMapper.login(account,pwd);
        if(result.isEmpty()) return ErrorCodeEnum.FAIL.toReturnValue("账号或密码错误");
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean regulatorLogin(LoginDTO loginDTO) {
        RegulatorInformationExample example = new RegulatorInformationExample();
        RegulatorInformationExample.Criteria criteria = example.createCriteria();
        criteria.andRegulatorAccountEqualTo(loginDTO.getAccount());
        criteria.andRegulatorPwdEqualTo(loginDTO.getPwd());
        List<RegulatorInformation> result = regulatorInformationMapper.selectByExample(example);
        if(result.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue("账号或密码错误");
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }
}
