package com.tsps.assessment.service.impl;

import com.tsps.assessment.dao.AssessmentDetailMapper;
import com.tsps.assessment.dao.AssessmentMapper;
import com.tsps.assessment.entity.Assessment;
import com.tsps.assessment.entity.AssessmentDetail;
import com.tsps.assessment.service.AssessmentTaskService;
import com.tsps.content.dao.AssessmentElementMapper;
import com.tsps.content.dao.AssessmentFileMapper;
import com.tsps.content.entity.AssessmentElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/9 20:41
 * @description:
 * @modified :
 */
@Service
public class AssessmentTaskServiceImpl implements AssessmentTaskService {

    @Autowired
    private AssessmentFileMapper assessmentFileMapper;

    @Autowired
    private AssessmentElementMapper assessmentElementMapper;

    @Autowired
    private AssessmentDetailMapper assessmentDetailMapper;

    @Autowired
    private AssessmentMapper assessmentMapper;

    @Transactional
    public void assessment(){
        //未考核记录
        List<Assessment> assessmentList = assessmentMapper.getAssessments();
        if(!CollectionUtils.isEmpty(assessmentList)) {
            //所有考核要素
            List<AssessmentElement> assessmentElementList = assessmentElementMapper.getAllElements();
            for (int i = 0; i < assessmentList.size(); i++){
                List<String> fileNameList = assessmentFileMapper.assessmentFileNameList(assessmentList.get(i).getCompanyId());
                if(CollectionUtils.isEmpty(fileNameList)){
                    assessmentList.get(i).setAssessmentTotalScore(0);
                }else {
                    int assessmentScore = 0;
                    List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
                    for(int j = 0; j < assessmentElementList.size(); j++){
                        if(fileNameList.contains(assessmentElementList.get(j).getAssessmentElementName())){
                            AssessmentDetail assessmentDetail = new AssessmentDetail();
                            assessmentDetail.setAssessmentId(assessmentList.get(i).getId());
                            assessmentDetail.setAssessmentElementId(assessmentElementList.get(j).getId());
                            assessmentDetail.setAssessmentScore(assessmentElementList.get(j).getScore());
                            assessmentDetailList.add(assessmentDetail);
                            assessmentScore += assessmentElementList.get(j).getScore();
                            fileNameList.remove(fileNameList.indexOf(assessmentElementList.get(j).getAssessmentElementName()));
                        }
                    }
                    assessmentList.get(i).setAssessmentStatus(1);
                    assessmentList.get(i).setAssessmentTotalScore(assessmentScore);
                    if(!CollectionUtils.isEmpty(assessmentDetailList)) {
                        assessmentDetailMapper.updateAssessmentScore(assessmentDetailList);
                    }
                }
            }
            assessmentMapper.updateAssessmentTotalScore(assessmentList);
        }
    }

}
