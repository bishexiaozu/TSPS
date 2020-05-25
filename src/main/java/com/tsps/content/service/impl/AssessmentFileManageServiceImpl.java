package com.tsps.content.service.impl;

import com.tsps.authority.dao.CompanyEmployeeMapper;
import com.tsps.authority.entity.CompanyEmployee;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.AssessmentElementMapper;
import com.tsps.content.dao.AssessmentFileMapper;
import com.tsps.content.dao.AssessmentItemMapper;
import com.tsps.content.dao.ElementEmployeeMapper;
import com.tsps.content.dto.AddAssessmentFileDTO;
import com.tsps.content.dto.AssessmentEmployeeDTO;
import com.tsps.content.entity.*;
import com.tsps.content.service.AssessmentFileManageService;
import com.tsps.content.vo.AssessmentElementVO;
import com.tsps.content.vo.AssessmentFileListVO;
import com.tsps.content.vo.AssessmentItemVO;
import com.tsps.content.vo.ItemElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    @Autowired
    private CompanyEmployeeMapper companyEmployeeMapper;

    @Override
    public ResultBean getHead(Integer company_id, Integer itemId) {
        ElementEmployeeExample example = new ElementEmployeeExample();
        ElementEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andCompanyIdEqualTo(company_id);
        criteria.andElementIdEqualTo(itemId);
        List<ElementEmployee> list = elementEmployeeMapper.selectByExample(example);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue("没有负责人");
        CompanyEmployee companyEmployee = companyEmployeeMapper.selectByPrimaryKey(list.get(0).getEmployeeId());
        return ErrorStatusEnum.SUCCESS.toReturnValue(companyEmployee);
    }

    @Override
    public ResultBean addAssessmentFile(AddAssessmentFileDTO addAssessmentFileDTO) {

        AssessmentFile file = new AssessmentFile();
        file.setAssessmentElementId(addAssessmentFileDTO.getElementId());
        file.setAmtFileTitle(addAssessmentFileDTO.getTitle());
        file.setAmtFilePath(addAssessmentFileDTO.getPath());
        file.setCompanyId(addAssessmentFileDTO.getCompanyId());
        file.setEmployeeId(addAssessmentFileDTO.getEmployeeId());
        int result = assessmentFileMapper.insertSelective(file);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean getEmployeeAssessmentFile(Integer employeeId, Integer elementId) {
        AssessmentFileExample example = new AssessmentFileExample();
        AssessmentFileExample.Criteria criteria = example.createCriteria();
        criteria.andEmployeeIdEqualTo(employeeId);
        criteria.andAssessmentElementIdEqualTo(elementId);
        List<AssessmentFile> list = assessmentFileMapper.selectByExample(example);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue("no file");
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean addAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO) {
        ElementEmployee elementEmployee = new ElementEmployee();
        elementEmployee.setElementId(assessmentEmployeeDTO.getItemId());
        elementEmployee.setEmployeeId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setCompanyId(assessmentEmployeeDTO.getCompanyId());
        int result = elementEmployeeMapper.insert(elementEmployee);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean modifyAssessmentEmployee(AssessmentEmployeeDTO assessmentEmployeeDTO) {
        ElementEmployee elementEmployee = new ElementEmployee();
        elementEmployee.setElementId(assessmentEmployeeDTO.getItemId());
        elementEmployee.setEmployeeId(assessmentEmployeeDTO.getEmployeeId());
        elementEmployee.setCompanyId(assessmentEmployeeDTO.getCompanyId());
        ElementEmployeeExample example = new ElementEmployeeExample();
        ElementEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andElementIdEqualTo(assessmentEmployeeDTO.getItemId());
        criteria.andCompanyIdEqualTo(assessmentEmployeeDTO.getCompanyId());
        int result = elementEmployeeMapper.updateByExample(elementEmployee,example);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean getAssessmentFileList(Integer elementId, Integer page) {
        page = (page - 1) * 10;
        List<AssessmentFileListVO> list = assessmentFileMapper.getAssessmentFileList(elementId,page);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getItemByEmployeeId(Integer id) {
        ElementEmployeeExample example = new ElementEmployeeExample();
        ElementEmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmployeeIdEqualTo(id);
        List<ElementEmployee> list = elementEmployeeMapper.selectByExample(example);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        List<AssessmentItemVO> items = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            AssessmentItem a = assessmentItemMapper.selectByPrimaryKey(list.get(i).getElementId());
            AssessmentItemVO vo = new AssessmentItemVO();
            vo.setId(a.getId());
            vo.setContent(a.getAssessmentItemName());
            items.add(vo);
        }
        return ErrorStatusEnum.SUCCESS.toReturnValue(items);

    }

    @Override
    public ResultBean getAssessmentItem() {

        List<AssessmentItemVO> list = assessmentItemMapper.getItems();
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getAssessmentElement(Integer itemId) {
        List<AssessmentElementVO> list = assessmentElementMapper.getElements(itemId);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotalAssessmentFile(Integer elementId) {
        AssessmentFileExample example = new AssessmentFileExample();
        AssessmentFileExample.Criteria criteria = example.createCriteria();
        criteria.andAssessmentElementIdEqualTo(elementId);
        Long total = assessmentFileMapper.countByExample(example);
        Integer all = new Integer(total.intValue());
        if(total>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(all);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean getElementFileList(Integer companyId, Integer elementId) {
        List<AssessmentFileListVO> list = assessmentFileMapper.getElementFileList(companyId,elementId);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean deleteAssessmentFile(Integer id) {
        int result = assessmentFileMapper.deleteByPrimaryKey(id);
        if(result > 0)
            return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.FAIL.toReturnValue();
    }

    @Override
    public ResultBean getElementIdList(Integer companyId) {
        List<ItemElement> list = assessmentFileMapper.getElementIdList(companyId);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        Set<Integer> element = new HashSet<Integer>();
        Set<Integer> item = new HashSet<Integer>();
        for(int i=0;i<list.size();i++){
            item.add(list.get(i).getItemId());
            element.add(list.get(i).getElementId());
        }
        Map<String,Set<Integer>> result = new HashMap<>();
        result.put("item",item);
        result.put("element",element);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);

    }
}
