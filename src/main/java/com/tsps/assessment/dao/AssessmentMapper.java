package com.tsps.assessment.dao;

import com.tsps.assessment.dto.ListUnAssessmentDTO;
import com.tsps.assessment.entity.Assessment;
import com.tsps.assessment.vo.UnAssessmentVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AssessmentMapper {

    int insertAssessment(Assessment assessment);

    List<Assessment> getPreviousAssessments(Integer companyId);

    Assessment getAssessment(@Param("companyId") Integer companyId, @Param("firstDay") Date firstDay, @Param("lastDay") Date lastDay);

    int updateSelfAssessmentTotalScore(@Param("assessmentId") Integer assessmentId, @Param("selfTotalScore") Integer selfTotalScore);

    Integer getAssessmentNumber(Integer companyId);

    List<Assessment> getAssessments();

    int updateAssessmentTotalScore(@Param("list") List<Assessment> list);

    int getUnAssessmentTotalNumber(ListUnAssessmentDTO listUnAssessmentDTO);

    List<UnAssessmentVO> listUnAssessment(ListUnAssessmentDTO listUnAssessmentDTO);

    Assessment selectById(Integer id);

    int updateAssessment(Assessment assessment);

    int applyForAssessment(@Param("assessmentId") Integer assessmentId, @Param("assessmentStatus") Integer assessmentStatus );

}