package com.tsps.material.service.impl;

import com.alibaba.fastjson.JSON;
import com.tsps.authority.dao.CompanyInformationMapper;
import com.tsps.common.Commons;
import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
import com.tsps.material.service.CompanyInformationService;
import com.tsps.material.vo.BasicInformationVO;
import com.tsps.material.vo.CompanyInformationVO;
import com.tsps.register.dto.CompanyRegisterDTO;
import com.tsps.util.RedisUtils;
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

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public BasicInformationVO getBasicInformation(Integer companyId) {
        BasicInformationVO basicInformationVO = (BasicInformationVO) redisUtils.get(Commons.BASIC_INFORMATION + companyId);
        if(basicInformationVO == null) {
            basicInformationVO = companyInformationMapper.getBasicInformation(companyId);
            redisUtils.set(Commons.BASIC_INFORMATION + companyId, basicInformationVO,Commons.REDIS_TIME);
        }
        return basicInformationVO;
    }

    @Override
    public CompanyInformationVO getCompanyInformation(Integer companyId) {
        CompanyInformationVO companyInformationVO = (CompanyInformationVO) redisUtils.get(Commons.COMPANY_INFORMATION + companyId);
        if(companyInformationVO == null) {
            companyInformationVO = companyInformationMapper.getCompanyInformation(companyId);
            redisUtils.set(Commons.COMPANY_INFORMATION + companyId, companyInformationVO, Commons.REDIS_TIME);
        }
        return companyInformationVO;
    }

    @Override
    public void updateBasicInformation(BasicInformationDTO basicInformationDTO) {
        companyInformationMapper.updateBasicInformation(basicInformationDTO);
        BasicInformationVO basicInformationVO = JSON.parseObject(JSON.toJSONString(basicInformationDTO), BasicInformationVO.class);
        redisUtils.set(Commons.BASIC_INFORMATION + basicInformationDTO.getId(), basicInformationVO, Commons.REDIS_TIME);
    }

    @Override
    public void updateCompanyInformation(CompanyInformationDTO companyInformationDTO) {
        companyInformationMapper.updateCompanyInformation(companyInformationDTO);
        CompanyInformationVO companyInformationVO = JSON.parseObject(JSON.toJSONString(companyInformationDTO), CompanyInformationVO.class);
        redisUtils.set(Commons.COMPANY_INFORMATION + companyInformationDTO.getId(), companyInformationVO, Commons.REDIS_TIME);
    }

    @Override
    public void companyRegister(CompanyRegisterDTO companyRegisterDTO) {
        companyInformationMapper.insertCompanyInformation(companyRegisterDTO);
    }
}
