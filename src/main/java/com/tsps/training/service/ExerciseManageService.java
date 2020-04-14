package com.tsps.training.service;

import com.tsps.common.ResultBean;
import com.tsps.training.dto.AddExerciseDTO;
import com.tsps.training.dto.ModifyExerciseDTO;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/13:40
 *  * @description : 注册试题管理服务
 *  * @modified :
 */
public interface ExerciseManageService {
    ResultBean addExercise(AddExerciseDTO addExerciseDTO);
    ResultBean modifyExercise(ModifyExerciseDTO modifyExerciseDTO);
    ResultBean deleteExercise(Integer id);
    ResultBean getExerciseList(Integer employeeId, Integer page);
    ResultBean getTotalExercise(Integer employeeId);
    ResultBean getTwentyExercise();
    ResultBean getTotal();
    ResultBean getList(Integer page);
}
