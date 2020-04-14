package com.tsps.assessment.dao;

import com.tsps.assessment.entity.Assessment;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface AssessmentMapper {

    int insertAssessment(Assessment assessment);

    List<Assessment> getPreviousAssessments(Integer companyId);

    Assessment getAssessment(@Param("companyId") Integer companyId, @Param("firstDay") Date firstDay, @Param("lastDay") Date lastDay);

    int updateSelfAssessmentTotalScore(@Param("assessmentId") Integer assessmentId, @Param("selfTotalScore") Integer selfTotalScore);

    Integer getAssessmentNumber(Integer companyId);

    List<Assessment> getAssessments();

    int updateAssessmentTotalScore(@Param("list") List<Assessment> list);


}