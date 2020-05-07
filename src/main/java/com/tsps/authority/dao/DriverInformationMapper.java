package com.tsps.authority.dao;

import com.tsps.authority.entity.DriverInformation;
import com.tsps.authority.entity.DriverInformationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DriverInformationMapper {
    long countByExample(DriverInformationExample example);

    List<DriverInformation> login(@Param("account") String account, @Param("pwd") String pwd);

    int deleteByExample(DriverInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DriverInformation record);

    int insertSelective(DriverInformation record);

    List<DriverInformation> selectByExample(DriverInformationExample example);

    List<DriverInformation> getNullAccount(@Param("companyId") Integer companyId, @Param("page") Integer page);
    List<DriverInformation> getAccount(@Param("companyId") Integer companyId, @Param("page") Integer page);

    long countNull(@Param("companyId") Integer companyId);
    long count(@Param("companyId") Integer companyId);

    DriverInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DriverInformation record, @Param("example") DriverInformationExample example);

    int updateByExample(@Param("record") DriverInformation record, @Param("example") DriverInformationExample example);

    int updateByPrimaryKeySelective(DriverInformation record);

    int updateByPrimaryKey(DriverInformation record);
}