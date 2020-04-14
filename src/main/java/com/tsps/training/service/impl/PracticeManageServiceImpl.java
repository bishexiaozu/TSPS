package com.tsps.training.service.impl;

import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.exam.dao.ExamMapper;
import com.tsps.exam.entity.Exam;
import com.tsps.training.dao.ExerciseMapper;
import com.tsps.training.dao.PracticeMapper;
import com.tsps.training.dto.PracticeDTO;
import com.tsps.training.dto.ScoreDTO;
import com.tsps.training.entity.Exercise;
import com.tsps.training.entity.Practice;
import com.tsps.training.entity.PracticeExample;
import com.tsps.training.service.PracticeManageService;
import com.tsps.training.vo.MarkedExerciseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/18:01
 *  *  * @description :实现做题服务类
 *  *  * @modified :
 */
@Service
public class PracticeManageServiceImpl implements PracticeManageService {
    @Autowired
    private PracticeMapper practiceMapper;
    @Autowired
    private ExerciseMapper exerciseMapper;

    @Autowired
    private ExamMapper examMapper;

    @Override
    public ResultBean getWrong(Integer driverId, Integer page) {
        page = (page - 1) * 10;
        String state = new String("0");
        List<Practice> list = practiceMapper.getWrong(driverId,state,page);
        List<MarkedExerciseVO> markedExerciseVO = new ArrayList<>();
        int size = list.size();
        if(size<=0) return ErrorCodeEnum.SUCCESS.toReturnValue();
        for(int i=0;i<size;i++){
            MarkedExerciseVO vo = new MarkedExerciseVO();
            Exercise exercise = exerciseMapper.selectByPrimaryKey(list.get(i).getExerciseId());
            vo.setAnswer(exercise.getExerciseAnswer());
            vo.setContent(exercise.getExerciseContent());
            vo.setExplain(exercise.getExerciseExplain());
            vo.setId(exercise.getId());
            vo.setOptionA(exercise.getExerciseOptiona());
            vo.setOptionB(exercise.getExerciseOptionb());
            vo.setOptionC(exercise.getExerciseOptionc());
            vo.setOptionD(exercise.getExerciseOptiond());
            vo.setPracticeAnswer(list.get(i).getAnswer());
            vo.setPracticeCollect(list.get(i).getCollect());
            vo.setPracticeState(list.get(i).getState());
            vo.setScore(list.get(i).getScore());
            markedExerciseVO.add(vo);
        }
        return ErrorCodeEnum.SUCCESS.toReturnValue(markedExerciseVO);

    }

    @Override
    public ResultBean getCollect(Integer driverId, Integer page) {
        page = (page - 1) * 10;
        String collect = new String("1");
        List<Practice> list = practiceMapper.getCollect(driverId,collect,page);
        List<MarkedExerciseVO> markedExerciseVO = new ArrayList<>();
        int size = list.size();
        if(size<=0) return ErrorCodeEnum.SUCCESS.toReturnValue();
        for(int i=0;i<size;i++){
            MarkedExerciseVO vo = new MarkedExerciseVO();
            Exercise exercise = exerciseMapper.selectByPrimaryKey(list.get(i).getExerciseId());
            vo.setAnswer(exercise.getExerciseAnswer());
            vo.setContent(exercise.getExerciseContent());
            vo.setExplain(exercise.getExerciseExplain());
            vo.setId(exercise.getId());
            vo.setOptionA(exercise.getExerciseOptiona());
            vo.setOptionB(exercise.getExerciseOptionb());
            vo.setOptionC(exercise.getExerciseOptionc());
            vo.setOptionD(exercise.getExerciseOptiond());
            vo.setPracticeAnswer(list.get(i).getAnswer());
            vo.setPracticeCollect(list.get(i).getCollect());
            vo.setPracticeState(list.get(i).getState());
            vo.setScore(list.get(i).getScore());
            markedExerciseVO.add(vo);
        }
        return ErrorCodeEnum.SUCCESS.toReturnValue(markedExerciseVO);
    }

    @Override
    public ResultBean getTotalWrong(Integer driverId) {
        PracticeExample example = new PracticeExample();
        PracticeExample.Criteria criteria = example.createCriteria();
        criteria.andDriverIdEqualTo(driverId);
        criteria.andStateEqualTo("0");
        Long all = practiceMapper.countByExample(example);
        criteria.andCollectEqualTo("3");
        Long part = practiceMapper.countByExample(example);
        Integer result = new Integer(all.intValue() - part.intValue());
        if(result>=0) return ErrorCodeEnum.SUCCESS.toReturnValue(result);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean getTotalCollect(Integer driverId) {
        PracticeExample example = new PracticeExample();
        PracticeExample.Criteria criteria = example.createCriteria();
        criteria.andDriverIdEqualTo(driverId);
        criteria.andCollectEqualTo("1");
        Long all = practiceMapper.countByExample(example);
        Integer result = new Integer(all.intValue());
        if(result>=0) return ErrorCodeEnum.SUCCESS.toReturnValue(result);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean setScore(ScoreDTO scoreDTO) {
        int size = scoreDTO.getList().size();
        int total = 0;
        for(int i = 0;i<size;i++){
            addPractice(scoreDTO.getList().get(i));
        }
        PracticeExample example = new PracticeExample();
        PracticeExample.Criteria criteria = example.createCriteria();
        criteria.andExamIdEqualTo(scoreDTO.getList().get(1).getExamId());
        List<Practice> list = practiceMapper.selectByExample(example);
        for(int i=0;i<list.size();i++){
            total+=list.get(i).getScore();
        }
        Exam exam = new Exam();
        exam.setId(scoreDTO.getList().get(1).getExamId());
        exam.setScore(total);
        int result = examMapper.updateByPrimaryKeySelective(exam);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public void addPractice(PracticeDTO practiceDTO) {
        Practice practice = new Practice();
        practice.setExamId(practiceDTO.getExamId());
        practice.setDriverId(practiceDTO.getDriverId());
        practice.setExerciseId(practiceDTO.getExerciseId());
        practice.setAnswer(practiceDTO.getAnswer());
        practice.setCollect(practiceDTO.getCollect());
        Exercise exercise = exerciseMapper.selectByPrimaryKey(practiceDTO.getExerciseId());
        if(exercise.getExerciseAnswer().equals(practiceDTO.getAnswer())){
            practice.setState("1");
            practice.setScore(exercise.getScore());
        }else {
            practice.setState("0");
            practice.setScore(0);
        }
        practiceMapper.insert(practice);

    }
}
