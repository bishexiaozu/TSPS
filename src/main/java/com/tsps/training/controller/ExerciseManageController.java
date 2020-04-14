package com.tsps.training.controller;

import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.training.dto.AddExerciseDTO;
import com.tsps.training.dto.ModifyExerciseDTO;
import com.tsps.training.service.ExerciseManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/15：04
 *  *  * @description : 试题控制器
 *  *  * @modified :
 */

@Controller
@RequestMapping("/exercise")
public class ExerciseManageController {
    @Autowired
    private ExerciseManageService exerciseManageService;

    @PostMapping("/addExercise")
    @ResponseBody
    public ResultBean addExercise(@RequestBody@Valid AddExerciseDTO addExerciseDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return exerciseManageService.addExercise(addExerciseDTO);
    }
    @PostMapping("/modifyExercise")
    @ResponseBody
    public ResultBean modifyExercise(@RequestBody@Valid ModifyExerciseDTO modifyExerciseDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors())
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        return exerciseManageService.modifyExercise(modifyExerciseDTO);
    }
    @PostMapping("/deleteExercise/{id}")
    @ResponseBody
    public ResultBean deleteExercise(@PathVariable Integer id){
        return exerciseManageService.deleteExercise(id);
    }
    @PostMapping("/getExerciseList/{employeeId}/{page}")
    @ResponseBody
    public ResultBean getExerciseList(@PathVariable Integer employeeId,@PathVariable Integer page){
        return exerciseManageService.getExerciseList(employeeId,page);
    }

    @PostMapping("/getTotalExercise/{employeeId}")
    @ResponseBody
    public ResultBean getTotalExercise(@PathVariable Integer employeeId){
        return exerciseManageService.getTotalExercise(employeeId);
    }

    @PostMapping("/getTwentyExercise")
    @ResponseBody
    public ResultBean getTwentyExercise(){
        return exerciseManageService.getTwentyExercise();
    }

    @PostMapping("/getTotal")
    @ResponseBody
    public ResultBean getTotal(){
        return exerciseManageService.getTotal();
    }

    @PostMapping("/getList/{page}")
    @ResponseBody
    public ResultBean getList(@PathVariable Integer page){
        return exerciseManageService.getList(page);
    }
}
