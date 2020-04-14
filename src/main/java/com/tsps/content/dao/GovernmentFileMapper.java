package com.tsps.content.dao;

import com.tsps.content.entity.GovernmentFile;
import com.tsps.content.entity.GovernmentFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GovernmentFileMapper {
    long countByExample(GovernmentFileExample example);

    int deleteByExample(GovernmentFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GovernmentFile record);

    int insertSelective(GovernmentFile record);

    List<GovernmentFile> selectByExample(GovernmentFileExample example);

    GovernmentFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GovernmentFile record, @Param("example") GovernmentFileExample example);

    int updateByExample(@Param("record") GovernmentFile record, @Param("example") GovernmentFileExample example);

    int updateByPrimaryKeySelective(GovernmentFile record);

    int updateByPrimaryKey(GovernmentFile record);
}