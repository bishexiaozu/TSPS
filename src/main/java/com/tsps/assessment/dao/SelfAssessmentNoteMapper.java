package com.tsps.assessment.dao;

import java.util.List;
import java.util.Map;

public interface SelfAssessmentNoteMapper {

    List<String> getSelfAssessmentNotes(Integer assessmentId);

    int updateSelfAssessmentNotes(Map<String, Object> map);

    int insertSelfAssessmentNotes(Map<String, Object> map);
}