package com.tsps.material.service;

import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
import com.tsps.material.dto.CompanyRegisterDTO;
import com.tsps.material.vo.BasicInformationVO;
import com.tsps.material.vo.CompanyInformationVO;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/5 22:00
 * @description:
 * @modified :
 */
public interface CompanyInformationService {

    BasicInformationVO getBasicInformation(Integer companyId);

    CompanyInformationVO getCompanyInformation(Integer companyId);

    void updateBasicInformation(BasicInformationDTO basicInformationDTO);

    void updateCompanyInformation(CompanyInformationDTO companyInformationDTO);

    void companyRegister(CompanyRegisterDTO companyRegisterDTO);
}
