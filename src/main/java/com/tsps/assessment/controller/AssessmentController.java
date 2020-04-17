package com.tsps.assessment.controller;

import com.tsps.assessment.dto.QueryAssessmentDTO;
import com.tsps.assessment.dto.SelfAssessmentDTO;
import com.tsps.assessment.service.AssessmentService;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.text.ParseException;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/7 21:37
 * @description:
 * @modified :
 */
@Controller
@RequestMapping(value = "/assessmentManagement")
public class AssessmentController {

    @Autowired
    private AssessmentService assessmentService;

    @GetMapping(value = "/assessmentNumber/{companyId}")
    @ResponseBody
    public ResultBean getAssessmentNumber(@PathVariable Integer companyId){
        return assessmentService.getAssessmentNumber(companyId);
    }

    @GetMapping(value = "/previousAssessments/{companyId}")
    @ResponseBody
    public ResultBean getPreviousAssessments(@PathVariable Integer companyId){
        return assessmentService.getPreviousAssessments(companyId);
    }

    //自评信息
    @PostMapping(value = "/selfAssessmentDetails")
    @ResponseBody
    public ResultBean getSelfAssessmentDetails(@Valid @RequestBody QueryAssessmentDTO queryAssessmentDTO, BindingResult bindingResult) throws ParseException {
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.getSelfAssessmentDetails(queryAssessmentDTO);
    }

    //上月考评信息
    @PostMapping(value = "/assessmentDetails")
    @ResponseBody
    public ResultBean getAssessmentDetails(@Valid @RequestBody QueryAssessmentDTO queryAssessmentDTO, BindingResult bindingResult) throws ParseException {
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.getSelfAssessmentDetails(queryAssessmentDTO);
    }

    @PostMapping(value = "/selfAssessment")
    @ResponseBody
    public ResultBean selfAssessment(@Valid @RequestBody SelfAssessmentDTO selfAssessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.selfAssessment(selfAssessmentDTO);
    }


}
