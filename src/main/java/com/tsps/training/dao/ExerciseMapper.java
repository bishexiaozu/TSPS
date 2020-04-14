package com.tsps.training.dao;

import com.tsps.training.entity.Exercise;
import com.tsps.training.entity.ExerciseExample;
import com.tsps.training.vo.ExerciseListVO;
import com.tsps.training.vo.ExerciseVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExerciseMapper {
    long countByExample(ExerciseExample example);

    int deleteByExample(ExerciseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Exercise record);

    int insertSelective(Exercise record);

    List<Exercise> selectByExample(ExerciseExample example);

    List<ExerciseListVO> getExerciseList(@Param("employeeId")Integer employeeId,@Param("page")Integer page);

    List<ExerciseVO> getTwentyExercise();

    Exercise selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    int updateByExample(@Param("record") Exercise record, @Param("example") ExerciseExample example);

    int updateByPrimaryKeySelective(Exercise record);

    int updateByPrimaryKey(Exercise record);

    Long getTotal();

    List<ExerciseVO> getList(Integer page);


}