package com.tsps.authority.service.impl;

import com.tsps.authority.dao.CompanyInformationMapper;
import com.tsps.authority.entity.CompanyInformation;
import com.tsps.authority.entity.CompanyInformationExample;
import com.tsps.authority.service.CompanyManageService;
import com.tsps.authority.vo.CompanyListVO;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : luxinnan
 * @date : 2020/4/10/20:50
 * @description : 实现企业部分管理服务
 * @modified :
 */
@Service
public class CompanyManageServiceImpl implements CompanyManageService {

    @Autowired
    private CompanyInformationMapper mapper;


    @Override
    public ResultBean deleteCompany(Integer id) {

        return ErrorStatusEnum.SUCCESS.toReturnValue(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean setCompanyState(Integer id) {
        CompanyInformation companyInformation = new CompanyInformation();
        companyInformation.setId(id);
        companyInformation.setState("1");
        return ErrorStatusEnum.SUCCESS.toReturnValue(mapper.updateByPrimaryKeySelective(companyInformation));
    }

    @Override
    public ResultBean getCompanyList(String state,Integer page) {
        int p = page.intValue() - 1;
        p*=10;
        page = new Integer(p);
        List<CompanyListVO> list = mapper.getCompanyList(state, page);
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotalCompany(String state) {
        CompanyInformationExample example = new CompanyInformationExample();
        CompanyInformationExample.Criteria criteria = example.createCriteria();
        criteria.andStateEqualTo(state);
        Long count = mapper.countByExample(example);
        Integer totalCompany = new Integer(count.intValue());
        if(totalCompany>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(totalCompany);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }
}
