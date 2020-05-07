package com.tsps.authority.service.impl;

import com.tsps.authority.dao.CompanyInformationMapper;
import com.tsps.authority.dao.DriverInformationMapper;
import com.tsps.authority.dto.AddDriverDTO;
import com.tsps.authority.dto.ModifyDriverDTO;
import com.tsps.authority.entity.DriverInformation;
import com.tsps.authority.service.DriverManageService;
import com.tsps.authority.vo.CompanyListVO;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.common.ResultBeanCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: luxinnan
 * @Date: 2020/5/6 23:43
 * @Discription:
 * @Modified:
 */
@Service
public class DriverManageServiceImpl implements DriverManageService {
    @Autowired
    private DriverInformationMapper driverInformationMapper;
    @Autowired
    private CompanyInformationMapper companyInformationMapper;
    @Override
    public ResultBeanCode addDriver(AddDriverDTO addDriverDTO) {
        DriverInformation driverInformation = new DriverInformation();
        driverInformation.setCompanyId(addDriverDTO.getCompanyID());
        driverInformation.setDriverName(addDriverDTO.getName());
        driverInformation.setDriverTel(addDriverDTO.getTel());
        driverInformation.setDriverPwd(addDriverDTO.getPwd());
        int result = driverInformationMapper.insertSelective(driverInformation);
        if(result > 0) return ErrorCodeEnum.SUCCESS.toReturnValue(result);
        return ErrorCodeEnum.FAIL.toReturnValue(result);

    }

    @Override
    public ResultBeanCode getCompanyNameList() {
        List<CompanyListVO> list = companyInformationMapper.getCompanyNameList();
        if(list.isEmpty()) return ErrorCodeEnum.FAIL.toReturnValue();
        return ErrorCodeEnum.SUCCESS.toReturnValue(list);

    }

    @Override
    public ResultBean modifyDriver(ModifyDriverDTO modifyDriverDTO) {
        DriverInformation driverInformation = new DriverInformation();
        driverInformation.setDriverName(modifyDriverDTO.getName());
        driverInformation.setCompanyId(modifyDriverDTO.getCompanyID());
        driverInformation.setDriverAccount(modifyDriverDTO.getAccount());
        driverInformation.setDriverPwd(modifyDriverDTO.getPwd());
        driverInformation.setDriverTel(modifyDriverDTO.getTel());
        driverInformation.setId(modifyDriverDTO.getId());
        int result = driverInformationMapper.updateByPrimaryKey(driverInformation);
        if(result>0) return ErrorStatusEnum.SUCCESS.toReturnValue(result);
        return ErrorStatusEnum.FAIL.toReturnValue();
    }



    @Override
    public ResultBean getDriverList(Integer companyId, Integer isNull, Integer page) {
        page = (page - 1) * 10;
        List<DriverInformation> list;
        if(isNull>0){
            list = driverInformationMapper.getNullAccount(companyId, page);
        }
        else {
            list = driverInformationMapper.getAccount(companyId, page);
        }
        if(list.isEmpty()) return ErrorStatusEnum.FAIL.toReturnValue();
        else return ErrorStatusEnum.SUCCESS.toReturnValue(list);


    }

    @Override
    public ResultBean getTotalDriver(Integer companyId, Integer isNull) {
        Long result;
        if(isNull>0){
            result = driverInformationMapper.countNull(companyId);
        }else{
            result = driverInformationMapper.count(companyId);
        }
        Integer count = new Integer(result.intValue());
        if(count>=0) return ErrorStatusEnum.SUCCESS.toReturnValue(count);
        return ErrorStatusEnum.FAIL.toReturnValue();
    }

    @Override
    public ResultBean deleteDriver(Integer id) {
        int result = driverInformationMapper.deleteByPrimaryKey(id);
        if(result > 0) return ErrorStatusEnum.SUCCESS.toReturnValue(result);
        return ErrorStatusEnum.FAIL.toReturnValue();
    }
}
