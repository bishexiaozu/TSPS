package com.tsps.authority.dao;

import com.tsps.authority.entity.CompanyInformation;
import com.tsps.authority.entity.CompanyInformationExample;
import com.tsps.authority.vo.CompanyListVO;
import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
import com.tsps.material.dto.CompanyRegisterDTO;
import com.tsps.material.vo.BasicInformationVO;
import com.tsps.material.vo.CompanyInformationVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyInformationMapper {
    long countByExample(CompanyInformationExample example);

    int deleteByExample(CompanyInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyInformation record);

    int insertSelective(CompanyInformation record);

    List<CompanyInformation> selectByExample(CompanyInformationExample example);

    List<CompanyListVO> getCompanyList(@Param("state") String state,@Param("page") Integer page);

    CompanyInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyInformation record, @Param("example") CompanyInformationExample example);

    int updateByExample(@Param("record") CompanyInformation record, @Param("example") CompanyInformationExample example);

    int updateByPrimaryKeySelective(CompanyInformation record);

    int updateByPrimaryKey(CompanyInformation record);

    BasicInformationVO getBasicInformation(Integer companyId);

    CompanyInformationVO getCompanyInformation(Integer companyId);

    void updateBasicInformation(BasicInformationDTO basicInformationDTO);

    void updateCompanyInformation(CompanyInformationDTO companyInformationDTO);

    void insertCompanyInformation(CompanyRegisterDTO companyRegisterDTO);
}