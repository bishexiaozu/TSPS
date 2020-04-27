package com.tsps.assessment.dao;

import com.tsps.assessment.entity.AssessmentDetail;
import com.tsps.assessment.vo.AssessmentElementDetailVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AssessmentDetailMapper {

    List<AssessmentElementDetailVO> getAssessmentElementDetailVOs(@Param("assessmentId") Integer assessmentId, @Param("assessmentItemId") Integer assessmentItemId);

    int updateAssessmentDetails(Map<String, Object> map);

    int insertAssessmentDetails(Map<String, Object> map);

    int updateAssessmentScore(@Param("list") List<AssessmentDetail> list);
}