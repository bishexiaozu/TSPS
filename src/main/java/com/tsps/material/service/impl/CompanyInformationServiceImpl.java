package com.tsps.material.service.impl;

import com.tsps.authority.dao.CompanyInformationMapper;
import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
import com.tsps.register.dto.CompanyRegisterDTO;
import com.tsps.material.service.CompanyInformationService;
import com.tsps.material.vo.BasicInformationVO;
import com.tsps.material.vo.CompanyInformationVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/5 22:00
 * @description:
 * @modified :
 */
@Service
public class CompanyInformationServiceImpl implements CompanyInformationService {

    @Autowired
    private CompanyInformationMapper companyInformationMapper;

    @Override
    public BasicInformationVO getBasicInformation(Integer companyId) {
        BasicInformationVO basicInformationVO = companyInformationMapper.getBasicInformation(companyId);
        return basicInformationVO;
    }

    @Override
    public CompanyInformationVO getCompanyInformation(Integer companyId) {
        CompanyInformationVO companyInformationVO = companyInformationMapper.getCompanyInformation(companyId);
        return companyInformationVO;
    }

    @Override
    public void updateBasicInformation(BasicInformationDTO basicInformationDTO) {
        companyInformationMapper.updateBasicInformation(basicInformationDTO);
    }

    @Override
    public void updateCompanyInformation(CompanyInformationDTO companyInformationDTO) {
        companyInformationMapper.updateCompanyInformation(companyInformationDTO);
    }

    @Override
    public void companyRegister(CompanyRegisterDTO companyRegisterDTO) {
        companyInformationMapper.insertCompanyInformation(companyRegisterDTO);
    }
}
