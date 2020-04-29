package com.tsps.assessment.service.impl;

import com.tsps.assessment.dao.AssessmentDetailMapper;
import com.tsps.assessment.dao.AssessmentMapper;
import com.tsps.assessment.dao.SelfAssessmentNoteMapper;
import com.tsps.assessment.dto.*;
import com.tsps.assessment.entity.Assessment;
import com.tsps.assessment.entity.AssessmentDetail;
import com.tsps.assessment.entity.SelfAssessmentNote;
import com.tsps.assessment.enums.AssessmentStatusEnum;
import com.tsps.assessment.service.AssessmentService;
import com.tsps.assessment.vo.*;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.AssessmentElementMapper;
import com.tsps.content.dao.AssessmentFileMapper;
import com.tsps.content.dao.AssessmentItemMapper;
import com.tsps.content.entity.AssessmentElement;
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

    @Autowired
    private AssessmentFileMapper assessmentFileMapper;

    @Autowired
    private AssessmentElementMapper assessmentElementMapper;

    @Override
    public ResultBean getAssessmentNumber(Integer companyId) {
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentMapper.getAssessmentNumber(companyId));
    }

    @Override
    public ResultBean getPreviousAssessments(Integer companyId) {
        List<Assessment> assessmentList = assessmentMapper.getPreviousAssessments(companyId);
        if(CollectionUtils.isEmpty(assessmentList)){
            return ErrorStatusEnum.SUCCESS.toReturnValue();
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
        return ErrorStatusEnum.SUCCESS.toReturnValue(previousAssessmentVOList);
    }

    @Override
    public ResultBean getSelfAssessmentDetails(QueryAssessmentDTO queryAssessmentDTO){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(queryAssessmentDTO.getDate());
        Date firstDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,1);
        int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date lastDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,dayOfMonth);
        Assessment assessment = assessmentMapper.getAssessment(queryAssessmentDTO.getCompanyId(), firstDay, lastDay);
        Integer assessmentId = assessment == null ? null : assessment.getId();
        AssessmentVO assessmentVO = setAssessmentVO(assessmentId, calendar);
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
    }

    @Override
    public ResultBean getLastMonthAssessmentDetails(QueryAssessmentDTO queryAssessmentDTO) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(queryAssessmentDTO.getDate());
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        Date firstDay = DateUtil.toDate(year, month,1);
        calendar.setTime(firstDay);
        Date lastDay = DateUtil.toDate(year, month, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Assessment assessment = assessmentMapper.getAssessment(queryAssessmentDTO.getCompanyId(), firstDay, lastDay);
        if(assessment == null){
            return ErrorStatusEnum.LAST_MONTH_ASSESSMENT_IS_EMPTY.toReturnValue();
        }
        AssessmentVO assessmentVO = setAssessmentVO(assessment.getId(), calendar);
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
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
            assessment.setAssessmentStatus(AssessmentStatusEnum.SELF_ASSESSMENT.getStatus());
            assessment.setSelfAssessmentTotalScore(selfTotalScore);
            assessment.setCreateTime(selfAssessmentDTO.getSelfAssessmentTime());
            assessmentMapper.insertAssessment(assessment);
            assessmentDetailMap.put("assessmentId",assessment.getId());
            assessmentDetailMapper.insertAssessmentDetails(assessmentDetailMap);
            selfAssessmentNoteMap.put("assessmentId",assessment.getId());
            selfAssessmentNoteMapper.insertSelfAssessmentNotes(selfAssessmentNoteMap);
        }
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean listUnAssessment(ListUnAssessmentDTO listUnAssessmentDTO) {
        int total = assessmentMapper.getUnAssessmentTotalNumber(listUnAssessmentDTO);
        ListUnAssessmentVO listUnAssessmentVO = new ListUnAssessmentVO();
        listUnAssessmentVO.setTotal(total);
        if(total == 0){
            return ErrorStatusEnum.SUCCESS.toReturnValue(listUnAssessmentVO);
        }
        List<UnAssessmentVO> unAssessmentVOList = assessmentMapper.listUnAssessment(listUnAssessmentDTO);
        if(CollectionUtils.isEmpty(unAssessmentVOList)){
            return ErrorStatusEnum.SUCCESS.toReturnValue(listUnAssessmentVO);
        }
        Calendar calendar = Calendar.getInstance();
        for(int i = 0; i < unAssessmentVOList.size(); i++){
            unAssessmentVOList.get(i).setAssessmentItem("十六项");
            calendar.setTime(unAssessmentVOList.get(i).getCreateTime());
            unAssessmentVOList.get(i).setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1 ) + "月");
        }
        listUnAssessmentVO.setList(unAssessmentVOList);
        return ErrorStatusEnum.SUCCESS.toReturnValue(listUnAssessmentVO);
    }

    @Override
    public ResultBean assessment(Integer id) {
        Assessment assessment = assessmentMapper.selectById(id);
        List<AssessmentElement> assessmentElementList = assessmentElementMapper.getAllElements();
        List<String> fileNameList = assessmentFileMapper.assessmentFileNameList(assessment.getCompanyId());
        if(CollectionUtils.isEmpty(fileNameList)){
            assessment.setAssessmentTotalScore(0);
        }else {
            int assessmentScore = 0;
            List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
            for(int i = 0; i < assessmentElementList.size(); i++){
                if(fileNameList.contains(assessmentElementList.get(i).getAssessmentElementName())){
                    AssessmentDetail assessmentDetail = new AssessmentDetail();
                    assessmentDetail.setAssessmentId(assessment.getId());
                    assessmentDetail.setAssessmentScore(assessmentElementList.get(i).getScore());
                    assessmentDetail.setAssessmentElementId(assessmentElementList.get(i).getId());
                    assessmentDetailList.add(assessmentDetail);
                    assessmentScore += assessmentElementList.get(i).getScore();
                    fileNameList.remove(fileNameList.indexOf(assessmentElementList.get(i).getAssessmentElementName()));
                }
            }
            assessment.setAssessmentStatus(AssessmentStatusEnum.ASSESSMENT.getStatus());
            assessment.setAssessmentTotalScore(assessmentScore);
            if(!CollectionUtils.isEmpty(assessmentDetailList)) {
                assessmentDetailMapper.updateAssessmentScore(assessmentDetailList);
            }
        }
        assessmentMapper.updateAssessment(assessment);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean applyForAssessment(Integer assessmentId) {
        assessmentMapper.applyForAssessment(assessmentId, AssessmentStatusEnum.APPLY_FOR_ASSESSMENT.getStatus());
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    AssessmentVO setAssessmentVO(Integer assessmentId,Calendar calendar){
        AssessmentVO assessmentVO = new AssessmentVO();
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
        if(assessmentId != null){
            List<String> selfAssessmentNoteList = selfAssessmentNoteMapper.getSelfAssessmentNotes(assessmentId);
            for(int i = 0 ; i < selfAssessmentNoteList.size(); i++){
                assessmentItemDetailVOList.get(i).setSelfAssessmentNote(selfAssessmentNoteList.get(i));
            }
        }
        assessmentVO.setAssessmentId(assessmentId);
        assessmentVO.setAssessmentItemDetailVOList(assessmentItemDetailVOList);
        assessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
        return assessmentVO;
    }
}
