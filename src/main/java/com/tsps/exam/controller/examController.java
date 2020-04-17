package com.tsps.exam.controller;

import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.exam.dto.ExamDTO;
import com.tsps.exam.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/19：20
 *  *  * @description : 考试控制器
 *  *  * @modified :
 */
@RequestMapping("/exam")
@Controller
public class examController {
    @Autowired
    private ExamService examService;
    @PostMapping("/addExam")
    @ResponseBody
    public ResultBean addExam(@RequestBody @Valid ExamDTO examDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors())return ErrorStatusEnum.FAIL.toReturnValue();
        return examService.addExam(examDTO);
    }
    @PostMapping("/getScore/{examId}")
    @ResponseBody
    public ResultBean getScore(@PathVariable Integer examId){
        return examService.getScore(examId);
    }
    @PostMapping("/getExamList/{driverId}/{page}")
    @ResponseBody
    public ResultBean getExamList(@PathVariable Integer driverId, @PathVariable Integer page){
        return examService.getExamList(driverId,page);
    }
    @PostMapping("/getTotalExam/{driverId}")
    @ResponseBody
    public ResultBean getTotalExam(@PathVariable Integer driverId){
        return examService.getTotalExam(driverId);
    }
}
