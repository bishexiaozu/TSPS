package com.tsps.content.dao;

import com.tsps.content.entity.GovernmentFile;
import com.tsps.content.entity.GovernmentFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GovernmentFileMapper {
    long countByExample(GovernmentFileExample example);

    int deleteByExample(GovernmentFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GovernmentFile record);

    int insertSelective(GovernmentFile record);

    List<GovernmentFile> selectByExample(GovernmentFileExample example);

    List<GovernmentFile> getGovernmentFileList(@Param("type")String type,@Param("page")Integer page);

    GovernmentFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GovernmentFile record, @Param("example") GovernmentFileExample example);

    int updateByExample(@Param("record") GovernmentFile record, @Param("example") GovernmentFileExample example);

    int updateByPrimaryKeySelective(GovernmentFile record);

    int updateByPrimaryKey(GovernmentFile record);
}