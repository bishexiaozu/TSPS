package com.tsps.exam.service;

import com.tsps.common.ResultBean;
import com.tsps.exam.dto.ExamDTO;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/13:40
 *  * @description : 注册考试服务
 *  * @modified :
 */
public interface ExamService {
    ResultBean addExam(ExamDTO examDTO);
    ResultBean getScore(Integer examId);
    ResultBean getExamList(Integer driverId, Integer page);
    ResultBean getTotalExam(Integer driverId);


}
