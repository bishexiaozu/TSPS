package com.tsps.content.service.impl;

import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dao.GovernmentFileMapper;
import com.tsps.content.dto.AddGovernmentFileDTO;
import com.tsps.content.entity.GovernmentFile;
import com.tsps.content.entity.GovernmentFileExample;
import com.tsps.content.service.GovernmentFileManageService;
import com.tsps.content.vo.GovernmentFileListVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/17:04
 *  * @description : 实现政府文件管理服务
 *  * @modified :
 */

@Service
public class GovernmentFileManageServiceImpl implements GovernmentFileManageService {

    @Autowired
    private GovernmentFileMapper mapper;

    @Override
    public ResultBean addGovernmentFile(AddGovernmentFileDTO addGovernmentFileDTO) {
        GovernmentFile governmentFile = new GovernmentFile();
        governmentFile.setGovFilePath(addGovernmentFileDTO.getPath());
        governmentFile.setGovFileTitle(addGovernmentFileDTO.getTitle());
        governmentFile.setGovFileType(addGovernmentFileDTO.getType());
        int result = mapper.insertSelective(governmentFile);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean deleteGovernmentFile(Integer id) {
        int result = mapper.deleteByPrimaryKey(id);
        return ErrorCodeEnum.SUCCESS.toReturnValue(result);
    }

    @Override
    public ResultBean getGovernmentFileList(String type) {
        GovernmentFileExample example = new GovernmentFileExample();
        GovernmentFileExample.Criteria criteria = example.createCriteria();
        criteria.andGovFileTypeEqualTo(type);
        List<GovernmentFile> list = mapper.selectByExample(example);
        if(list.isEmpty()) return ErrorCodeEnum.SUCCESS.toReturnValue();
        ArrayList<GovernmentFileListVO> vo = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            GovernmentFileListVO o = new GovernmentFileListVO();
            o.setId(list.get(i).getId());
            o.setPath(list.get(i).getGovFilePath());
            o.setTime(list.get(i).getGovFileUploadTime());
            o.setTitle(list.get(i).getGovFileTitle());
            vo.add(o);
        }
        return ErrorCodeEnum.SUCCESS.toReturnValue(vo);
    }
}
