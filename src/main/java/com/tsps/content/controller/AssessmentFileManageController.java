package com.tsps.content.controller;


import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dto.AddAssessmentFileDTO;
import com.tsps.content.dto.AssessmentEmployeeDTO;
import com.tsps.content.service.AssessmentFileManageService;
import com.tsps.util.upload.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.tsps.common.Commons;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/12：43
 *  *  * @description : 企业文件控制器
 *  *  * @modified :
 */
@RequestMapping("/assessment_file")
@Controller
public class AssessmentFileManageController {

    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    @ResponseBody
    public ResultBean uploadAssessmentFile(MultipartFile multipartFile){
        return ErrorCodeEnum.SUCCESS.toReturnValue(uploadService.uploadFile(multipartFile, Commons.ASSESSMENT_FILE_DIRECTORY_URL));
    }

    @Autowired
    private AssessmentFileManageService service;
    @PostMapping("/addAssessmentFile")
    @ResponseBody
    public ResultBean addAssessmentFile(@RequestBody@Valid AddAssessmentFileDTO addAssessmentFileDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return service.addAssessmentFile(addAssessmentFileDTO);
    }
    @PostMapping("/addAssessmentEmployee")
    @ResponseBody
    public ResultBean addAssessmentEmployee(@RequestBody@Valid AssessmentEmployeeDTO assessmentEmployeeDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return service.addAssessmentEmployee(assessmentEmployeeDTO);
    }
    @PostMapping("/modifyAssessmentEmployee")
    @ResponseBody
    public ResultBean modifyAssessmentEmployee(@RequestBody@Valid AssessmentEmployeeDTO assessmentEmployeeDTO,BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return service.modifyAssessmentEmployee(assessmentEmployeeDTO);
    }
    @PostMapping("/getAssessmentItem")
    @ResponseBody
    public ResultBean getAssessmentItem(){
        return service.getAssessmentItem();
    }
    @PostMapping("/getAssessmentElement/{itemId}")
    @ResponseBody
    public ResultBean getAssessmentElement(@PathVariable Integer itemId){
        return service.getAssessmentElement(itemId);
    }
    @PostMapping("/getAssessmentFileList/{elementId}/{page}")
    @ResponseBody
    public ResultBean getAssessmentFileList(@PathVariable Integer elementId, @PathVariable Integer page){
        return service.getAssessmentFileList(elementId,page);
    }

    @PostMapping("/getTotalAssessmentFile/{elementId}")
    @ResponseBody
    public ResultBean getTotalAssessmentFile(@PathVariable Integer elementId){
        return service.getTotalAssessmentFile(elementId);
    }



}
