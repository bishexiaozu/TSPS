package com.tsps.exam.dao;

import com.tsps.exam.dto.ExamDTO;
import com.tsps.exam.entity.Exam;
import com.tsps.exam.entity.ExamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamMapper {
    long countByExample(ExamExample example);

    int deleteByExample(ExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Exam record);

    int insertSelective(Exam record);

    List<Exam> selectByExample(ExamExample example);

    List<Exam> getExamList(@Param("driverId")Integer driverId,@Param("page")Integer page);

    int selectLatest(ExamDTO examDTO);

    Exam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByExample(@Param("record") Exam record, @Param("example") ExamExample example);

    int updateByPrimaryKeySelective(Exam record);

    int updateByPrimaryKey(Exam record);
}