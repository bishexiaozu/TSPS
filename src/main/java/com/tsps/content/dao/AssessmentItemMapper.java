package com.tsps.content.dao;

import com.tsps.content.entity.AssessmentItem;
import com.tsps.content.entity.AssessmentItemExample;
import com.tsps.content.vo.AssessmentItemVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentItemMapper {
    long countByExample(AssessmentItemExample example);

    int deleteByExample(AssessmentItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentItem record);

    int insertSelective(AssessmentItem record);

    List<AssessmentItemVO> getItems();
    List<AssessmentItem> selectByExample(AssessmentItemExample example);

    AssessmentItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssessmentItem record, @Param("example") AssessmentItemExample example);

    int updateByExample(@Param("record") AssessmentItem record, @Param("example") AssessmentItemExample example);

    int updateByPrimaryKeySelective(AssessmentItem record);

    int updateByPrimaryKey(AssessmentItem record);

    List<AssessmentItem> getAssessmentItemList();
}