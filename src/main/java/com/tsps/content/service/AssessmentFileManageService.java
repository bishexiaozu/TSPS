package com.tsps.content.service;

import com.tsps.common.ResultBean;
import com.tsps.content.dto.AddAssessmentFileDTO;
import com.tsps.content.dto.AssessmentEmployeeDTO;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/17:04
 *  * @description : 实现企业文件管理服务
 *  * @modified :
 */
public interface AssessmentFileManageService {

    ResultBean addAssessmentFile(AddAssessmentFileDTO addAssessmentFileDTO);
    ResultBean addAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO);
    ResultBean modifyAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO);
    ResultBean getHead(Integer company_id, Integer itemId);
    ResultBean getAssessmentFileList(Integer elementId, Integer page);
    ResultBean getAssessmentItem();
    ResultBean getAssessmentElement(Integer itemId);
    ResultBean getItemByEmployeeId(Integer id);
    ResultBean getTotalAssessmentFile(Integer elementId);
    ResultBean getEmployeeAssessmentFile(Integer employeeId,Integer elementId);



}
