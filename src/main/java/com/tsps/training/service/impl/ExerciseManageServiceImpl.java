package com.tsps.training.service.impl;

import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.training.dao.ExerciseMapper;
import com.tsps.training.dto.AddExerciseDTO;
import com.tsps.training.dto.ModifyExerciseDTO;
import com.tsps.training.entity.Exercise;
import com.tsps.training.entity.ExerciseExample;
import com.tsps.training.service.ExerciseManageService;
import com.tsps.training.vo.ExerciseListVO;
import com.tsps.training.vo.ExerciseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/11/13:53
 *  * @description : 实现试题管理服务
 *  * @modified :
 */

@Service
public class ExerciseManageServiceImpl implements ExerciseManageService {

    @Autowired
    private ExerciseMapper mapper;

    @Override
    public ResultBean addExercise(AddExerciseDTO addExerciseDTO) {
        Exercise exercise = new Exercise();
        exercise.setCompanyId(addExerciseDTO.getCompanyId());
        exercise.setEmployeeId(addExerciseDTO.getEmployeeId());
        exercise.setExerciseContent(addExerciseDTO.getContent());
        exercise.setExerciseAnswer(addExerciseDTO.getAnswer());
        exercise.setExerciseExplain(addExerciseDTO.getExplain());
        exercise.setScore(addExerciseDTO.getScore());
        exercise.setExerciseOptiona(addExerciseDTO.getOptionA());
        exercise.setExerciseOptionb(addExerciseDTO.getOptionB());
        exercise.setExerciseOptionc(addExerciseDTO.getOptionC());
        exercise.setExerciseOptiond(addExerciseDTO.getOptionD());
        int result = mapper.insertSelective(exercise);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean modifyExercise(ModifyExerciseDTO modifyExerciseDTO) {
        Exercise exercise = new Exercise();
        exercise.setId(modifyExerciseDTO.getId());
        exercise.setEmployeeId(modifyExerciseDTO.getEmployeeId());
        exercise.setExerciseContent(modifyExerciseDTO.getContent());
        exercise.setExerciseAnswer(modifyExerciseDTO.getAnswer());
        exercise.setExerciseExplain(modifyExerciseDTO.getExplain());
        exercise.setScore(modifyExerciseDTO.getScore());
        exercise.setExerciseOptiona(modifyExerciseDTO.getOptionA());
        exercise.setExerciseOptionb(modifyExerciseDTO.getOptionB());
        exercise.setExerciseOptionc(modifyExerciseDTO.getOptionC());
        exercise.setExerciseOptiond(modifyExerciseDTO.getOptionD());
        int result = mapper.updateByPrimaryKeySelective(exercise);
        return ErrorStatusEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean deleteExercise(Integer id) {
        return ErrorStatusEnum.SUCCESS.toReturnValue(mapper.deleteByPrimaryKey(id));
    }

    @Override
    public ResultBean getExerciseList(Integer employeeId, Integer page) {
        page = (page - 1) * 10;
        List<ExerciseListVO> list = mapper.getExerciseList(employeeId,page);
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotalExercise(Integer employeeId) {
        ExerciseExample exerciseExample = new ExerciseExample();
        ExerciseExample.Criteria criteria = exerciseExample.createCriteria();
        criteria.andEmployeeIdEqualTo(employeeId);
        Long result = mapper.countByExample(exerciseExample);
        Integer total = new Integer(result.intValue());
        if(result>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(result);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @Override
    public ResultBean getTwentyExercise() {
        List<ExerciseVO> list = mapper.getTwentyExercise();
        if(list.isEmpty()) return ErrorStatusEnum.SUCCESS.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }

    @Override
    public ResultBean getTotal() {
        return ErrorStatusEnum.SUCCESS.toReturnValue(new Integer(mapper.getTotal().intValue()));
    }

    @Override
    public ResultBean getList(Integer page) {
        page = (page - 1) * 10;
        List<ExerciseVO> list = mapper.getList(page);
        if(list.isEmpty()) return ErrorStatusEnum.FAIL.toReturnValue();
        return ErrorStatusEnum.SUCCESS.toReturnValue(list);
    }
}
