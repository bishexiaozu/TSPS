package com.tsps.authority.dao;

import com.tsps.authority.entity.CompanyEmployee;
import com.tsps.authority.entity.CompanyEmployeeExample;
import com.tsps.authority.vo.EmployeeListVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CompanyEmployeeMapper {
    long countByExample(CompanyEmployeeExample example);

    int deleteByExample(CompanyEmployeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyEmployee record);

    int insertSelective(CompanyEmployee record);

    List<CompanyEmployee> selectByExample(CompanyEmployeeExample example);

    List<EmployeeListVO> getEmployeeList(@Param("companyId") Integer companyId, @Param("page") Integer page);

    CompanyEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyEmployee record, @Param("example") CompanyEmployeeExample example);

    int updateByExample(@Param("record") CompanyEmployee record, @Param("example") CompanyEmployeeExample example);

    int updateByPrimaryKeySelective(CompanyEmployee record);

    int updateByPrimaryKey(CompanyEmployee record);
}