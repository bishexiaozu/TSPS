package com.tsps.assessment.service;

import com.tsps.assessment.dto.QueryAssessmentDTO;
import com.tsps.assessment.dto.SelfAssessmentDTO;
import com.tsps.common.ResultBean;

import java.text.ParseException;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 21:45
 * @description:
 * @modified :
 */
public interface AssessmentService {

    ResultBean getAssessmentNumber(Integer companyId);

    /*
     * 历史考评列表分页
     * @author     ：YongBiao Liao
     * @date       ：Created in 2020/4/9 1:18
     * @param       listPreviousAssessmentDTO
     * @return     : com.test.common.ResultBean
     */
    ResultBean getPreviousAssessments(Integer companyId);

    /*
     * 查看自评信息,查看上月考评结果
     * @author     ：YongBiao Liao
     * @date       ：Created in 2020/4/8 17:46
     * @param       queryAssessmentDTO
     * @return     : com.test.common.ResultBean
     */
    ResultBean getSelfAssessmentDetails(QueryAssessmentDTO queryAssessmentDTO) throws ParseException;

    /*
     *  自评
     * @author     ：YongBiao Liao
     * @date       ：Created in 2020/4/8 21:10
     * @param       selfAssessmentDTO
     * @return     : com.test.common.ResultBean
     */
    ResultBean selfAssessment(SelfAssessmentDTO selfAssessmentDTO);
}
