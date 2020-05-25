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
import com.tsps.common.Commons;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.AssessmentElementMapper;
import com.tsps.content.dao.AssessmentFileMapper;
import com.tsps.content.dao.AssessmentItemMapper;
import com.tsps.content.entity.AssessmentElement;
import com.tsps.content.entity.AssessmentItem;
import com.tsps.util.DateUtil;
import com.tsps.util.RedisUtils;
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

    @Autowired
    private RedisUtils redisUtils;

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

    @Transactional
    @Override
    public ResultBean getSelfAssessmentDetails(QueryAssessmentDTO queryAssessmentDTO){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(queryAssessmentDTO.getDate());
        Date firstDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,1);
        int dayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date lastDay = DateUtil.toDate(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH) + 1,dayOfMonth);
        Assessment assessment = assessmentMapper.getAssessment(queryAssessmentDTO.getCompanyId(), firstDay, lastDay);

        AssessmentVO assessmentVO = new AssessmentVO();
        List<AssessmentItemDetailVO> assessmentItemDetailVOList = new ArrayList<>();
        List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
        int selfTotalScore = getTotalScore(0,queryAssessmentDTO.getCompanyId(), assessmentDetailList, assessmentItemDetailVOList,1);

        assessmentVO.setAssessmentItemDetailVOList(assessmentItemDetailVOList);

        Map<String, Object> assessmentDetailMap = new HashMap<>();
        assessmentDetailMap.put("list",assessmentDetailList);
        if(assessment == null){
            assessment = new Assessment();
            assessment.setSelfAssessmentTotalScore(selfTotalScore);
            assessment.setCompanyId(queryAssessmentDTO.getCompanyId());
            assessment.setCreateTime(queryAssessmentDTO.getDate());
            assessment.setAssessmentStatus(AssessmentStatusEnum.SELF_ASSESSMENT.getStatus());
            assessmentMapper.insertAssessment(assessment);
            assessmentDetailMap.put("assessmentId",assessment.getId());
            assessmentDetailMapper.insertAssessmentDetails(assessmentDetailMap);
        }else {
            assessmentMapper.updateSelfAssessmentTotalScore(assessment.getId(), selfTotalScore);
            assessmentDetailMap.put("assessmentId",assessment.getId());
            assessmentDetailMapper.updateAssessmentDetails(assessmentDetailMap);
            List<SelfAssessmentNote> selfAssessmentNoteList = selfAssessmentNoteMapper.getSelfAssessmentNotes(assessment.getId());
            for(int i = 0 ; i < selfAssessmentNoteList.size(); i++){
                assessmentItemDetailVOList.get(i).setSelfAssessmentNote(selfAssessmentNoteList.get(i).getSelfAssessmentNote());
            }
        }
        assessmentVO.setAssessmentId(assessment.getId());
        assessmentVO.setSelfAssessmentTotalScore(selfTotalScore);
        assessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
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
        AssessmentVO assessmentVO = (AssessmentVO) redisUtils.get(Commons.LAST_MONTH_ASSESSMENT_DETAILS + assessment.getId());
        if(assessmentVO != null){
            return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
        }
        assessmentVO = setAssessmentVO(assessment, calendar);
        redisUtils.set(Commons.LAST_MONTH_ASSESSMENT_DETAILS + assessment.getId(), assessmentVO, Commons.REDIS_TIME);
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
    }

    @Transactional
    @Override
    public ResultBean selfAssessment(SelfAssessmentDTO selfAssessmentDTO) {
        List<SelfAssessmentNote> selfAssessmentNoteList = new ArrayList<>();
        List<SelfAssessmentItemDetailDTO> list = selfAssessmentDTO.getSelfAssessmentItemDetailDTOList();
        for(int i = 0; i < list.size(); i++){
            SelfAssessmentNote selfAssessmentNote = new SelfAssessmentNote();
            selfAssessmentNote.setAssessmentItemId(list.get(i).getAssessmentItemId());
            selfAssessmentNote.setSelfAssessmentNote(list.get(i).getSelfAssessmentNote());
            selfAssessmentNoteList.add(selfAssessmentNote);
        }
        Map<String, Object> selfAssessmentNoteMap = new HashMap<>();
        selfAssessmentNoteMap.put("list",selfAssessmentNoteList);
        selfAssessmentNoteMap.put("assessmentId",selfAssessmentDTO.getAssessmentId());
        if(CollectionUtils.isEmpty(selfAssessmentNoteMapper.getSelfAssessmentNotes(selfAssessmentDTO.getAssessmentId()))) {
            selfAssessmentNoteMapper.insertSelfAssessmentNotes(selfAssessmentNoteMap);
        }else {
            selfAssessmentNoteMapper.updateSelfAssessmentNotes(selfAssessmentNoteMap);
        }
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean listAssessment(ListAssessmentDTO listAssessmentDTO) {
        int total = assessmentMapper.getAssessmentTotalNumber(listAssessmentDTO);
        PageAssessmentVO pageAssessmentVO = new PageAssessmentVO();
        pageAssessmentVO.setTotal(total);
        if(total == 0){
            return ErrorStatusEnum.SUCCESS.toReturnValue(pageAssessmentVO);
        }
        List<ListAssessmentVO> listAssessmentVOList = assessmentMapper.listAssessment(listAssessmentDTO);
        if(CollectionUtils.isEmpty(listAssessmentVOList)){
            return ErrorStatusEnum.SUCCESS.toReturnValue(pageAssessmentVO);
        }
        Calendar calendar = Calendar.getInstance();
        for(int i = 0; i < listAssessmentVOList.size(); i++){
            listAssessmentVOList.get(i).setAssessmentItem("十六项");
            calendar.setTime(listAssessmentVOList.get(i).getCreateTime());
            listAssessmentVOList.get(i).setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1 ) + "月");
        }
        pageAssessmentVO.setList(listAssessmentVOList);
        return ErrorStatusEnum.SUCCESS.toReturnValue(pageAssessmentVO);
    }

    @Transactional
    @Override
    public ResultBean assessment(AssessmentDTO assessmentDTO) {
        Assessment assessment = assessmentMapper.selectById(assessmentDTO.getAssessmentId());
        int assessmentTotalScore = 0;
        List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
        List<SelfAssessmentNote> selfAssessmentNoteList = new ArrayList<>();

        List<AssessmentItemDetailDTO> itemDetailDTOList = assessmentDTO.getAssessmentItemDetailDTOList();
        for(int i = 0; i < itemDetailDTOList.size(); i++){
            List<AssessmentElementDetailDTO> elementDetailDTOList = itemDetailDTOList.get(i).getAssessmentElementDetailDTOList();
            for(int j = 0; j < elementDetailDTOList.size(); j++){
                AssessmentDetail assessmentDetail = new AssessmentDetail();
                assessmentDetail.setAssessmentId(assessment.getId());
                assessmentDetail.setAssessmentScore(elementDetailDTOList.get(j).getAssessmentScore());
                assessmentDetail.setAssessmentElementId(elementDetailDTOList.get(j).getAssessmentElementId());
                assessmentDetailList.add(assessmentDetail);
                assessmentTotalScore += elementDetailDTOList.get(j).getAssessmentScore();
            }
            SelfAssessmentNote selfAssessmentNote = new SelfAssessmentNote();
            selfAssessmentNote.setAssessmentItemId(itemDetailDTOList.get(i).getAssessmentItemId());
            selfAssessmentNote.setAssessmentNote(itemDetailDTOList.get(i).getAssessmentNote());
            selfAssessmentNote.setAssessmentId(assessment.getId());
            selfAssessmentNoteList.add(selfAssessmentNote);
        }
        selfAssessmentNoteMapper.updateAssessmentNote(selfAssessmentNoteList);
        assessmentDetailMapper.updateAssessmentScore(assessmentDetailList);
        assessment.setAssessmentTotalScore(assessmentTotalScore);
        assessment.setAssessmentStatus(AssessmentStatusEnum.ASSESSMENT.getStatus());
        assessmentMapper.updateAssessment(assessment);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean applyForAssessment(Integer assessmentId) {
        assessmentMapper.applyForAssessment(assessmentId, AssessmentStatusEnum.APPLY_FOR_ASSESSMENT.getStatus());
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean getPreviousAssessmentDetails(Integer id) {
        AssessmentVO assessmentVO = (AssessmentVO) redisUtils.get(Commons.LAST_MONTH_ASSESSMENT_DETAILS + id);
        if(assessmentVO != null){
            return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
        }
        Assessment assessment = assessmentMapper.selectById(id);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(assessment.getCreateTime());
        assessmentVO = setAssessmentVO(assessment, calendar);
        redisUtils.set(Commons.LAST_MONTH_ASSESSMENT_DETAILS + assessment.getId(), assessmentVO, Commons.REDIS_TIME);
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
    }

    @Override
    public ResultBean getUnAssessmentDetails(Integer id) {
        Assessment assessment = assessmentMapper.selectById(id);
        AssessmentVO assessmentVO = new AssessmentVO();
        List<AssessmentItemDetailVO> assessmentItemDetailVOList = new ArrayList<>();
        List<AssessmentDetail> assessmentDetailList = new ArrayList<>();
        int totalScore = getTotalScore(assessment.getId(),assessment.getCompanyId(),assessmentDetailList,assessmentItemDetailVOList,2);
        assessmentVO.setAssessmentItemDetailVOList(assessmentItemDetailVOList);
        Map<String, Object> assessmentDetailMap = new HashMap<>();
        assessmentDetailMap.put("list",assessmentDetailList);

        assessmentMapper.updateAssessmentTotalScore(assessment.getId(), totalScore);
        assessmentDetailMapper.updateAssessmentScore(assessmentDetailList);

        assessmentVO.setAssessmentId(assessment.getId());
        assessmentVO.setSelfAssessmentTotalScore(assessment.getSelfAssessmentTotalScore());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(assessment.getCreateTime());
        assessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
        return ErrorStatusEnum.SUCCESS.toReturnValue(assessmentVO);
    }

    AssessmentVO setAssessmentVO(Assessment assessment,Calendar calendar){
        AssessmentVO assessmentVO = new AssessmentVO();
        List<AssessmentItem> assessmentItemList = assessmentItemMapper.getAssessmentItemList();
        List<AssessmentItemDetailVO> assessmentItemDetailVOList = new ArrayList<>();
        for(int i = 0; i < assessmentItemList.size(); i++){
            AssessmentItemDetailVO assessmentItemDetailVO = new AssessmentItemDetailVO();
            assessmentItemDetailVO.setAssessmentItemId(assessmentItemList.get(i).getId());
            assessmentItemDetailVO.setAssessmentItemName(assessmentItemList.get(i).getAssessmentItemName());
            assessmentItemDetailVO.setAssessmentItemScore(assessmentItemList.get(i).getScore());
            assessmentItemDetailVO.setAssessmentElementDetailVOList(assessmentDetailMapper.getAssessmentElementDetailVOs(assessment.getId(), assessmentItemList.get(i).getId()));
            assessmentItemDetailVOList.add(assessmentItemDetailVO);
        }
        List<SelfAssessmentNote> selfAssessmentNoteList = selfAssessmentNoteMapper.getSelfAssessmentNotes(assessment.getId());
        for(int i = 0 ; i < selfAssessmentNoteList.size(); i++){
            assessmentItemDetailVOList.get(i).setAssessmentNote(selfAssessmentNoteList.get(i).getAssessmentNote());
            assessmentItemDetailVOList.get(i).setSelfAssessmentNote(selfAssessmentNoteList.get(i).getSelfAssessmentNote());
        }
        assessmentVO.setSelfAssessmentTotalScore(assessment.getSelfAssessmentTotalScore());
        assessmentVO.setAssessmentTotalScore(assessment.getAssessmentTotalScore());
        assessmentVO.setAssessmentId(assessment.getId());
        assessmentVO.setAssessmentItemDetailVOList(assessmentItemDetailVOList);
        assessmentVO.setAssessmentTime(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月");
        return assessmentVO;
    }

    //1 自评 2考评
    int getTotalScore(Integer assessmentId, Integer companyId, List<AssessmentDetail> assessmentDetailList,
                      List<AssessmentItemDetailVO> assessmentItemDetailVOList, int flag){
        int totalScore = 0;
        List<AssessmentItem> assessmentItemList = assessmentItemMapper.getAssessmentItemList();
        for(int i = 0; i < assessmentItemList.size(); i++){
            AssessmentItemDetailVO assessmentItemDetailVO = new AssessmentItemDetailVO();
            assessmentItemDetailVO.setAssessmentItemId(assessmentItemList.get(i).getId());
            assessmentItemDetailVO.setAssessmentItemName(assessmentItemList.get(i).getAssessmentItemName());
            assessmentItemDetailVO.setAssessmentItemScore(assessmentItemList.get(i).getScore());
            List<AssessmentElementDetailVO> assessmentElementDetailVOList = new ArrayList<>();
            List<AssessmentElement> assessmentElementList = assessmentElementMapper.getElementsByItemId(assessmentItemList.get(i).getId());
            for(int j = 0; j < assessmentElementList.size(); j++){
                AssessmentDetail assessmentDetail = new AssessmentDetail();
                assessmentDetail.setAssessmentItemId(assessmentItemList.get(i).getId());
                assessmentDetail.setAssessmentElementId(assessmentElementList.get(j).getId());
                int score = assessmentFileMapper.countFiles(companyId,assessmentElementList.get(j).getId()) > 0
                        ? assessmentElementList.get(j).getScore() : 0;
                totalScore += score;

                AssessmentElementDetailVO assessmentElementDetailVO= new AssessmentElementDetailVO();
                assessmentElementDetailVO.setAssessmentElementId(assessmentElementList.get(j).getId());
                assessmentElementDetailVO.setAssessmentElementName(assessmentElementList.get(j).getAssessmentElementName());
                assessmentElementDetailVO.setScore(assessmentElementList.get(j).getScore());
                assessmentElementDetailVO.setSelfAssessmentScore(score);
                if(flag == 1){
                    assessmentDetail.setSelfAssessmentScore(score);
                    assessmentElementDetailVO.setSelfAssessmentScore(score);
                }
                if(flag == 2){
                    assessmentDetail.setAssessmentId(assessmentId);
                    assessmentDetail.setAssessmentScore(score);
                    assessmentElementDetailVO.setAssessmentScore(score);
                }
                assessmentDetailList.add(assessmentDetail);
                assessmentElementDetailVOList.add(assessmentElementDetailVO);
            }
            assessmentItemDetailVO.setAssessmentElementDetailVOList(assessmentElementDetailVOList);
            assessmentItemDetailVOList.add(assessmentItemDetailVO);
        }
        List<SelfAssessmentNote> selfAssessmentNoteList = selfAssessmentNoteMapper.getSelfAssessmentNotes(assessmentId);
        for(int i = 0 ; i < selfAssessmentNoteList.size(); i++){
            assessmentItemDetailVOList.get(i).setSelfAssessmentNote(selfAssessmentNoteList.get(i).getSelfAssessmentNote());
        }
        return totalScore;
    }

}
