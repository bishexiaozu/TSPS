package com.tsps.authority.service;

import com.tsps.common.ResultBean;

/**
 *  * @author : luxinnan
 *  * @date : 2020/4/10/20:43
 *  * @description : 实现企业部分管理服务
 *  * @modified :
 */
public interface CompanyManageService {
    ResultBean deleteCompany(Integer id);
    ResultBean setCompanyState(Integer id);
    ResultBean getCompanyList(String state, Integer page);
    ResultBean getTotalCompany(String state);

}
