package com.tsps.content.service;

import com.tsps.common.ResultBean;
import com.tsps.content.dto.AddGovernmentFileDTO;

public interface GovernmentFileManageService {

    ResultBean addGovernmentFile(AddGovernmentFileDTO addGovernmentFileDTO);
    ResultBean deleteGovernmentFile(Integer id);
    ResultBean getGovernmentFileList(String type);

}
