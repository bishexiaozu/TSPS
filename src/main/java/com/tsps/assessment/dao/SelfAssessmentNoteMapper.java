package com.tsps.assessment.dao;

import com.tsps.assessment.entity.SelfAssessmentNote;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SelfAssessmentNoteMapper {

    List<SelfAssessmentNote> getSelfAssessmentNotes(Integer assessmentId);

    int updateSelfAssessmentNotes(Map<String, Object> map);

    int insertSelfAssessmentNotes(Map<String, Object> map);

    int updateAssessmentNote(@Param("list") List<SelfAssessmentNote> list);
}