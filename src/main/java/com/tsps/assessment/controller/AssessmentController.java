package com.tsps.assessment.controller;

import com.tsps.assessment.dto.AssessmentDTO;
import com.tsps.assessment.dto.ListAssessmentDTO;
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

    @GetMapping(value = {"/assessmentNumber/{companyId}", "/assessmentNumber/"})
    @ResponseBody
    public ResultBean getAssessmentNumber(@PathVariable(required = false) Integer companyId){
        return assessmentService.getAssessmentNumber(companyId);
    }

    @GetMapping(value = {"/previousAssessments/{companyId}", "/previousAssessments/"})
    @ResponseBody
    public ResultBean getPreviousAssessments(@PathVariable(required = false) Integer companyId){
        return assessmentService.getPreviousAssessments(companyId);
    }

    //自评信息
    @PostMapping(value = "/selfAssessmentDetails")
    @ResponseBody
    public ResultBean getSelfAssessmentDetails(@Valid @RequestBody QueryAssessmentDTO queryAssessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.getSelfAssessmentDetails(queryAssessmentDTO);
    }

    //上月考评信息
    @PostMapping(value = "/assessmentDetails")
    @ResponseBody
    public ResultBean getLastMonthAssessmentDetails(@Valid @RequestBody QueryAssessmentDTO queryAssessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.getLastMonthAssessmentDetails(queryAssessmentDTO);
    }

    @PostMapping(value = "/selfAssessment")
    @ResponseBody
    public ResultBean selfAssessment(@Valid @RequestBody SelfAssessmentDTO selfAssessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.selfAssessment(selfAssessmentDTO);
    }

    @PostMapping(value = "/listUnAssessment")
    @ResponseBody
    public ResultBean listUnAssessment(@Valid @RequestBody ListAssessmentDTO listAssessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.listAssessment(listAssessmentDTO);
    }

    @PostMapping(value = "/assessment")
    @ResponseBody
    public ResultBean assessment(@Valid @RequestBody AssessmentDTO assessmentDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        return assessmentService.assessment(assessmentDTO);
    }

    @GetMapping(value = {"/applyForAssessment/{assessmentId}", "/applyForAssessment/"})
    @ResponseBody
    public ResultBean applyForAssessment(@PathVariable(required = false) Integer assessmentId){
        if(assessmentId == null){
            return ErrorStatusEnum.UN_SELF_ASSESSMENT.toReturnValue();
        }
        return assessmentService.applyForAssessment(assessmentId);
    }

    @GetMapping(value = {"/previousAssessmentDetails/{id}"})
    @ResponseBody
    public ResultBean getPreviousAssessmentDetails(@PathVariable Integer id){
        return assessmentService.getPreviousAssessmentDetails(id);
    }



}
