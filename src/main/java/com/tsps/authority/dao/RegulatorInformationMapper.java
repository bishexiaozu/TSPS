package com.tsps.authority.dao;

import com.tsps.authority.entity.RegulatorInformation;
import com.tsps.authority.entity.RegulatorInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegulatorInformationMapper {
    long countByExample(RegulatorInformationExample example);

    int deleteByExample(RegulatorInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegulatorInformation record);

    int insertSelective(RegulatorInformation record);

    List<RegulatorInformation> selectByExample(RegulatorInformationExample example);

    RegulatorInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegulatorInformation record, @Param("example") RegulatorInformationExample example);

    int updateByExample(@Param("record") RegulatorInformation record, @Param("example") RegulatorInformationExample example);

    int updateByPrimaryKeySelective(RegulatorInformation record);

    int updateByPrimaryKey(RegulatorInformation record);
}