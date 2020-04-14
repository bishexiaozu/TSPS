package com.tsps.content.dao;

import com.tsps.content.entity.ElementEmployee;
import com.tsps.content.entity.ElementEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElementEmployeeMapper {
    long countByExample(ElementEmployeeExample example);

    int deleteByExample(ElementEmployeeExample example);

    int deleteByPrimaryKey(Integer elementId);

    int insert(ElementEmployee record);

    int insertSelective(ElementEmployee record);

    List<ElementEmployee> selectByExample(ElementEmployeeExample example);

    ElementEmployee selectByPrimaryKey(Integer elementId);

    int updateByExampleSelective(@Param("record") ElementEmployee record, @Param("example") ElementEmployeeExample example);

    int updateByExample(@Param("record") ElementEmployee record, @Param("example") ElementEmployeeExample example);

    int updateByPrimaryKeySelective(ElementEmployee record);

    int updateByPrimaryKey(ElementEmployee record);
}