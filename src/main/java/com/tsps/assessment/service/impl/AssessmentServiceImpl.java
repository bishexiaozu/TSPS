package com.tsps.assessment.service.impl;

import com.tsps.assessment.dao.AssessmentDetailMapper;
import com.tsps.assessment.dao.AssessmentMapper;
import com.tsps.assessment.dao.SelfAssessmentNoteMapper;
import com.tsps.assessment.dto.QueryAssessmentDTO;
import com.tsps.assessment.dto.SelfAssessmentDTO;
import com.tsps.assessment.dto.SelfAssessmentElementDetailDTO;
import com.tsps.assessment.dto.SelfAssessmentItemDetailDTO;
import com.tsps.assessment.entity.Assessment;
import com.tsps.assessment.entity.AssessmentDetail;
import com.tsps.assessment.entity.SelfAssessmentNote;
import com.tsps.assessment.service.AssessmentService;
import com.tsps.assessment.vo.AssessmentItemDetailVO;
import com.tsps.assessment.vo.AssessmentVO;
import com.tsps.assessment.vo.PreviousAssessmentVO;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.AssessmentItemMapper;
import com.tsps.content.entity.AssessmentItem;
import com.tsps.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 21:45
 * @description:
 * @modified :
 */
@Service
public class AssessmentServiceImpl implements AssessmentService {

    @Autowired
    private AssessmentMapper assessmentMapper;

    @Autowired
    private AssessmentItemMapper assessmentItemMapper;

    @Autowired
    private AssessmentDetailMapper assessmentDetailMapper;

    @Autowired
    private SelfAssessmentNoteMapper selfAssessmentNoteMapper;

    @Override
    public ResultBean getAssessmentNumber(Integer companyId) {
        return ErrorCodeEnum.SUCCESS.toReturnValue(assessmentMapper.getAssessmentNumber(companyId));
    }

    @Override
    public ResultBean getPreviousAssessments(Integer companyId) {
        List<Assessment> assessmentList = assessmentMapper.getPreviousAssessments(companyId);
        if(CollectionUtils.isEmpty(assessmentList)){
            return ErrorCodeEnum.SUCCESS.toReturnValue();
        }
        List<PreviousAssessmentVO> previousAssessmentVOList = new ArrayList<>();
        int size = assessmentList.size();
        Calendar calendar = Calendar.getInstance();
        for(int i = 0; i < size; i++){
            PreviousAssessmentVO previousAssessmentVO = new PreviousAssessmentVO();
            previousAssessmentVO.setId(assessmentList.get(i).getId());
            previousAssessmentVO.setAssessmentItem("十六项");
            calendar.setTime(assessmentList.get(i).getCreateTime());
            previousAssessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1 ) + "月");
            previousAssessmentVO.setSelfAssessmentTotalScore(assessmentList.get(i).getSelfAssessmentTotalScore());
            previousAssessmentVO.setAssessmentTotalScore(assessmentList.get(i).getAssessmentTotalScore());
            previousAssessmentVOList.add(previousAssessmentVO);
        }
        return ErrorCodeEnum.SUCCESS.toReturnValue(previousAssessmentVOList);
    }

    @Override
    public ResultBean getSelfAssessmentDetails(QueryAssessmentDTO queryAssessmentDTO){
        AssessmentVO assessmentVO = new AssessmentVO();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(queryAssessmentDTO.getDate());
        Date firstDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,1);
        Date lastDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Assessment assessment = assessmentMapper.getAssessment(queryAssessmentDTO.getCompanyId(), firstDay, lastDay);
        Integer assessmentId = assessment == null ? null : assessment.getId();
        List<AssessmentItem> assessmentItemList = assessmentItemMapper.getAssessmentItemList();
        List<AssessmentItemDetailVO> assessmentItemDetailVOList = new ArrayList<>();
        for(int i = 0; i < assessmentItemList.size(); i++){
            AssessmentItemDetailVO assessmentItemDetailVO = new AssessmentItemDetailVO();
            assessmentItemDetailVO.setAssessmentItemId(assessmentItemList.get(i).getId());
            assessmentItemDetailVO.setAssessmentItemName(assessmentItemList.get(i).getAssessmentItemName());
            assessmentItemDetailVO.setAssessmentItemScore(assessmentItemList.get(i).getScore());
            assessmentItemDetailVO.setAssessmentElementDetailVOList(assessmentDetailMapper.getAssessmentElementDetailVOs(assessmentId, assessmentItemList.get(i).getId()));
            assessmentItemDetailVOList.add(assessmentItemDetailVO);
        }
        if(assessment != null){
            List<String> selfAssessmentNoteList = selfAssessmentNoteMapper.getSelfAssessmentNotes(assessmentId);
            for(int i = 0 ; i < selfAssessmentNoteList.size(); i++){
                assessmentItemDetailVOList.get(i).setSelfAssessmentNote(selfAssessmentNoteList.get(i));
            }
        }
        assessmentVO.setAssessmentId(assessmentId);
        assessmentVO.setAssessmentItemDetailVOList(assessmentItemDetailVOList);
        assessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
        return ErrorCodeEnum.SUCCESS.toReturnValue(assessmentVO);
    }

    @Transactional
    @Override
    public ResultBean selfAssessment(SelfAssessmentDTO selfAssessmentDTO) {
        List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
        List<SelfAssessmentNote> selfAssessmentNoteList = new ArrayList<>();
        List<SelfAssessmentItemDetailDTO> itemDetailDTOList = selfAssessmentDTO.getSelfAssessmentItemDetailDTOList();
        int selfTotalScore = 0;
        for(int i = 0; i < itemDetailDTOList.size(); i++){
            List<SelfAssessmentElementDetailDTO> elementDetailDTOList = itemDetailDTOList.get(i).getSelfAssessmentElementDetailDTOList();
            //自评描述
            SelfAssessmentNote selfAssessmentNote = new SelfAssessmentNote();
            selfAssessmentNote.setAssessmentItemId(itemDetailDTOList.get(i).getAssessmentItemId());
            selfAssessmentNote.setSelfAssessmentNote(itemDetailDTOList.get(i).getSelfAssessmentNote());
            selfAssessmentNoteList.add(selfAssessmentNote);
            //每项考核项目对应考核要素的细节
            for(int j = 0; j < elementDetailDTOList.size(); j++){
                AssessmentDetail assessmentDetail = new AssessmentDetail();
                assessmentDetail.setAssessmentItemId(itemDetailDTOList.get(i).getAssessmentItemId());
                assessmentDetail.setAssessmentElementId(elementDetailDTOList.get(j).getAssessmentElementId());
                assessmentDetail.setSelfAssessmentScore(elementDetailDTOList.get(j).getSelfAssessmentScore());
                selfTotalScore += elementDetailDTOList.get(j).getSelfAssessmentScore();
                assessmentDetailList.add(assessmentDetail);
            }
        }
        Integer assessmentId = selfAssessmentDTO.getAssessmentId();
        Map<String, Object> assessmentDetailMap = new HashMap<>();
        assessmentDetailMap.put("list",assessmentDetailList);

        Map<String, Object> selfAssessmentNoteMap = new HashMap<>();
        selfAssessmentNoteMap.put("list",selfAssessmentNoteList);

        if(assessmentId == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selfAssessmentDTO.getSelfAssessmentTime());
            Date firstDay = DateUtil.toDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, 1);
            Date lastDay = DateUtil.toDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH) + 1, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
            Assessment assessment = assessmentMapper.getAssessment(selfAssessmentDTO.getCompanyId(), firstDay, lastDay);
            assessmentId = assessment == null ? null : assessment.getId();
        }

        if(assessmentId != null){
            assessmentMapper.updateSelfAssessmentTotalScore(assessmentId, selfTotalScore);
            assessmentDetailMap.put("assessmentId",assessmentId);
            assessmentDetailMapper.updateAssessmentDetails(assessmentDetailMap);
            selfAssessmentNoteMap.put("assessmentId",assessmentId);
            selfAssessmentNoteMapper.updateSelfAssessmentNotes(selfAssessmentNoteMap);
        }else {
            Assessment assessment = new Assessment();
            assessment.setCompanyId(selfAssessmentDTO.getCompanyId());
            assessment.setAssessmentStatus(0);
            assessment.setSelfAssessmentTotalScore(selfTotalScore);
            assessment.setCreateTime(selfAssessmentDTO.getSelfAssessmentTime());
            assessmentMapper.insertAssessment(assessment);
            assessmentDetailMap.put("assessmentId",assessment.getId());
            assessmentDetailMapper.insertAssessmentDetails(assessmentDetailMap);
            selfAssessmentNoteMap.put("assessmentId",assessment.getId());
            selfAssessmentNoteMapper.insertSelfAssessmentNotes(selfAssessmentNoteMap);
        }
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }
}
