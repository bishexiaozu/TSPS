package com.tsps.content.service.impl;

import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.AssessmentElementMapper;
import com.tsps.content.dao.AssessmentFileMapper;
import com.tsps.content.dao.AssessmentItemMapper;
import com.tsps.content.dao.ElementEmployeeMapper;
import com.tsps.content.dto.AddAssessmentFileDTO;
import com.tsps.content.dto.AssessmentEmployeeDTO;
import com.tsps.content.entity.AssessmentFile;
import com.tsps.content.entity.AssessmentFileExample;
import com.tsps.content.entity.ElementEmployee;
import com.tsps.content.service.AssessmentFileManageService;
import com.tsps.content.vo.AssessmentElementVO;
import com.tsps.content.vo.AssessmentFileListVO;
import com.tsps.content.vo.AssessmentItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/13:52
 *  * @description : 实现企业文件管理服务
 *  * @modified :
 */

@Service
public class AssessmentFileManageServiceImpl implements AssessmentFileManageService {

    @Autowired
    private AssessmentFileMapper assessmentFileMapper;
    @Autowired
    private AssessmentElementMapper assessmentElementMapper;
    @Autowired
    private AssessmentItemMapper assessmentItemMapper;
    @Autowired
    private ElementEmployeeMapper elementEmployeeMapper;

    @Override
    public ResultBean addAssessmentFile(AddAssessmentFileDTO addAssessmentFileDTO) {

        AssessmentFile file = new AssessmentFile();
        file.setAssessmentElementId(addAssessmentFileDTO.getElementId());
        file.setAmtFileTitle(addAssessmentFileDTO.getTitle());
        file.setAmtFilePath(addAssessmentFileDTO.getPath());
        file.setCompanyId(addAssessmentFileDTO.getCompanyId());
        file.setEmployeeId(addAssessmentFileDTO.getEmployeeId());
        int result = assessmentFileMapper.insertSelective(file);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean addAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO) {
        ElementEmployee elementEmployee = new ElementEmployee();
        elementEmployee.setElementId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setEmployeeId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setCompanyId(assessmentEmployeeDTO.getCompanyId());
        int result = elementEmployeeMapper.insert(elementEmployee);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean modifyAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO) {
        ElementEmployee elementEmployee = new ElementEmployee();
        elementEmployee.setElementId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setEmployeeId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setCompanyId(assessmentEmployeeDTO.getCompanyId());
        int result = elementEmployeeMapper.updateByPrimaryKey(elementEmployee);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean getAssessmentFileList(Integer elementId, Integer page) {
        page = (page - 1) * 10;
        List<AssessmentFileListVO> list = assessmentFileMapper.getAssessmentFileList(elementId,page);
        if(list.isEmpty()) return ErrorCodeEnum.SUCCESS.toReturnValue();
        return ErrorCodeEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getAssessmentItem() {

        List<AssessmentItemVO> list = assessmentItemMapper.getItems();
        if(list.isEmpty()) return ErrorCodeEnum.SUCCESS.toReturnValue();
        return ErrorCodeEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getAssessmentElement(Integer itemId) {
        List<AssessmentElementVO> list = assessmentElementMapper.getElements(itemId);
        if(list.isEmpty()) return ErrorCodeEnum.SUCCESS.toReturnValue();
        return ErrorCodeEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotalAssessmentFile(Integer elementId) {
        AssessmentFileExample example = new AssessmentFileExample();
        AssessmentFileExample.Criteria criteria = example.createCriteria();
        criteria.andAssessmentElementIdEqualTo(elementId);
        Long total = assessmentFileMapper.countByExample(example);
        Integer all = new Integer(total.intValue());
        if(total>=0) return ErrorCodeEnum.SUCCESS.toReturnValue(all);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }
}
