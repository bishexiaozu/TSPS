package com.tsps.training.controller;

import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.training.dto.ScoreDTO;
import com.tsps.training.service.PracticeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/11/19：14
 *  *  * @description : 做题控制器
 *  *  * @modified :
 */

@RequestMapping("/practice")
@Controller
public class PracticeManageController {

    @Autowired
    private PracticeManageService service;

    @PostMapping("/setScore")
    @ResponseBody
    public ResultBean setScore(@RequestBody@Valid ScoreDTO scoreDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()) return ErrorStatusEnum.FAIL.toReturnValue();

        return service.setScore(scoreDTO);
    }

    @PostMapping("/getWrong/{driverId}/{page}")
    @ResponseBody
    public ResultBean getWrong(@PathVariable Integer driverId ,@PathVariable Integer page){
        return service.getWrong(driverId, page);
    }
    @PostMapping("/getCollect/{driverId}/{page}")
    @ResponseBody
    public ResultBean getCollect(@PathVariable Integer driverId ,@PathVariable Integer page){
        return service.getCollect(driverId, page);
    }
    @PostMapping("/getTotalWrong/{driverId}")
    @ResponseBody
    public ResultBean getTotalWrong(@PathVariable Integer driverId){
        return service.getTotalWrong(driverId);
    }
    @PostMapping("/getTotalCollect/{driverId}")
    @ResponseBody
    public ResultBean getTotalCollect(@PathVariable Integer driverId){
        return service.getTotalCollect(driverId);
    }



}
