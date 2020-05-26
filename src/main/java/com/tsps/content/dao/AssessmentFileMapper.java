package com.tsps.content.dao;

import com.tsps.content.entity.AssessmentFile;
import com.tsps.content.entity.AssessmentFileExample;
import com.tsps.content.vo.AssessmentFileListVO;
import com.tsps.content.vo.ItemElement;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssessmentFileMapper {
    long countByExample(AssessmentFileExample example);

    int deleteByExample(AssessmentFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AssessmentFile record);

    int insertSelective(AssessmentFile record);

    List<AssessmentFileListVO> getElementFileList(@Param("companyId") Integer companyId,@Param("elementId")Integer elementId);
    List<AssessmentFileListVO> getAssessmentFileList(@Param("elementId") Integer elementId,@Param("page" )Integer page);
    List<AssessmentFile> selectByExample(AssessmentFileExample example);

    AssessmentFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AssessmentFile record, @Param("example") AssessmentFileExample example);

    int updateByExample(@Param("record") AssessmentFile record, @Param("example") AssessmentFileExample example);

    int updateByPrimaryKeySelective(AssessmentFile record);

    int updateByPrimaryKey(AssessmentFile record);

    int getFileID();

    List<String> assessmentFileNameList(Integer companyId);

    int countFiles(@Param("companyId") Integer companyId, @Param("assessmentElementId")Integer assessmentElementId);

    List<ItemElement> getElementIdList(@Param("companyId") Integer companyId);

    List<AssessmentFile> getAll();
}