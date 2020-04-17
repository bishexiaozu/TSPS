package com.tsps.exam.service.impl;

import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.exam.dao.ExamMapper;
import com.tsps.exam.dto.ExamDTO;
import com.tsps.exam.entity.Exam;
import com.tsps.exam.entity.ExamExample;
import com.tsps.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Override
    public ResultBean addExam(ExamDTO examDTO) {

        int result = examMapper.selectLatest(examDTO);
        if(result>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(examDTO.getId());
        return ErrorStatusEnum.FAIL.toReturnValue();
    }

    @Override
    public ResultBean getScore(Integer examId) {
        Exam exam = examMapper.selectByPrimaryKey(examId);
        if(exam!=null) return ErrorStatusEnum.SUCCESS.toReturnValue(exam.getScore());
        return ErrorStatusEnum.FAIL.toReturnValue();

    }

    @Override
    public ResultBean getExamList(Integer driverId, Integer page) {
        page = (page - 1)*10;
        List<Exam> list = examMapper.getExamList(driverId,page);
        if(list.isEmpty()) return ErrorStatusEnum.FAIL.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotalExam(Integer driverId) {
        ExamExample examExample = new ExamExample();
        ExamExample.Criteria criteria = examExample.createCriteria();
        criteria.andDriverIdEqualTo(driverId);
        Long result = examMapper.countByExample(examExample);
        Integer all = new Integer(result.intValue());
        if(all>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(all);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }


}
