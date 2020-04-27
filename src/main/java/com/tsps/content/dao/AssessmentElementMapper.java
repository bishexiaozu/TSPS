package com.tsps.content.dao;

import com.tsps.content.entity.AssessmentElement;
import com.tsps.content.entity.AssessmentElementExample;
import com.tsps.content.vo.AssessmentElementVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentElementMapper {
    long countByExample(AssessmentElementExample example);

    int deleteByExample(AssessmentElementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentElement record);

    int insertSelective(AssessmentElement record);

    List<AssessmentElementVO> getElements(Integer id);

    List<AssessmentElement> selectByExample(AssessmentElementExample example);

    AssessmentElement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssessmentElement record, @Param("example") AssessmentElementExample example);

    int updateByExample(@Param("record") AssessmentElement record, @Param("example") AssessmentElementExample example);

    int updateByPrimaryKeySelective(AssessmentElement record);

    int updateByPrimaryKey(AssessmentElement record);

    List<AssessmentElement> getAllElements();
}