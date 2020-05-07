package com.tsps.authority.service;

import com.tsps.authority.dto.AddDriverDTO;
import com.tsps.authority.dto.ModifyDriverDTO;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;

/**
 * @Author: luxinnan
 * @Date: 2020/5/6 23:17
 * @Discription:
 * @Modified:
 */

public interface DriverManageService {
    ResultBeanCode addDriver(AddDriverDTO addDriverDTO);
    ResultBeanCode getCompanyNameList();
    ResultBean modifyDriver(ModifyDriverDTO modifyDriverDTO);
    ResultBean getDriverList(Integer companyId, Integer isNull, Integer page);
    ResultBean getTotalDriver(Integer companyId, Integer isNull);
    ResultBean deleteDriver(Integer id);

}
