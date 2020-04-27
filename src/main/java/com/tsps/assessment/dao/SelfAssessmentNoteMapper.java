package com.tsps.assessment.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface SelfAssessmentNoteMapper {

    List<String> getSelfAssessmentNotes(Integer assessmentId);

    int updateSelfAssessmentNotes(Map<String, Object> map);

    int insertSelfAssessmentNotes(Map<String, Object> map);
}