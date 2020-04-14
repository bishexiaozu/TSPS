package com.tsps.training.dao;

import com.tsps.training.entity.Practice;
import com.tsps.training.entity.PracticeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PracticeMapper {
    long countByExample(PracticeExample example);

    int deleteByExample(PracticeExample example);

    int insert(Practice record);

    int insertSelective(Practice record);

    List<Practice> getWrong(@Param("driverId")Integer driverId, @Param("state")String state,@Param("page")Integer page);
    List<Practice> getCollect(@Param("driverId")Integer driverId, @Param("collect")String state,@Param("page")Integer page);


    List<Practice> selectByExample(PracticeExample example);

    int updateByExampleSelective(@Param("record") Practice record, @Param("example") PracticeExample example);

    int updateByExample(@Param("record") Practice record, @Param("example") PracticeExample example);
}