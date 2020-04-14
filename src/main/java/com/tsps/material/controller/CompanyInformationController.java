package com.tsps.material.controller;

import com.tsps.common.Commons;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
import com.tsps.material.dto.CompanyRegisterDTO;
import com.tsps.material.service.CompanyInformationService;
import com.tsps.util.upload.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/5 18:02
 * @description:
 * @modified :
 */
@Controller
@RequestMapping(value = "/informationManage")
public class CompanyInformationController {

    @Autowired
    private CompanyInformationService companyInformationService;

    @Autowired
    private UploadService uploadService;

    @GetMapping(value = "/basicInformation/{companyId}")
    @ResponseBody
    public ResultBean getBasicInformation(@PathVariable Integer companyId){
        return ErrorCodeEnum.SUCCESS.toReturnValue(companyInformationService.getBasicInformation(companyId));
    }

    @GetMapping(value = "/companyInformation/{companyId}")
    @ResponseBody
    public ResultBean getCompanyInformation(@PathVariable Integer companyId){
        return ErrorCodeEnum.SUCCESS.toReturnValue(companyInformationService.getCompanyInformation(companyId));
    }

    @PostMapping(value = "/basicInformation")
    @ResponseBody
    public ResultBean updateBasicInformation(@RequestBody @Valid BasicInformationDTO basicInformationDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.updateBasicInformation(basicInformationDTO);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

    @PostMapping(value = "/companyInformation")
    @ResponseBody
    public ResultBean updateCompanyInformation(@RequestBody @Valid CompanyInformationDTO companyInformationDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.updateCompanyInformation(companyInformationDTO);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

    @PostMapping(value = "/companyRegister")
    @ResponseBody
    public ResultBean companyRegister(@RequestBody @Valid CompanyRegisterDTO companyRegisterDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.companyRegister(companyRegisterDTO);
        return ErrorCodeEnum.SUCCESS.toReturnValue();
    }

    @PostMapping("/upload/identityPhoto")
    @ResponseBody
    public ResultBean uploadIdentityPhoto(MultipartFile multipartFile) {
        return ErrorCodeEnum.SUCCESS.toReturnValue(uploadService.uploadFile(multipartFile, Commons.IDENTITY_PHOTOS_DIRECTORY_URL));
    }

    @PostMapping("/upload/businessLicensePhoto")
    @ResponseBody
    public ResultBean uploadBusinessLicensePhoto(MultipartFile multipartFile) {
        return ErrorCodeEnum.SUCCESS.toReturnValue(uploadService.uploadFile(multipartFile, Commons.BUSINESS_LICENSE_PHOTO_DIRECTORY_URL));
    }

    @PostMapping("/upload/companySignature")
    @ResponseBody
    public ResultBean uploadCompanySignature(MultipartFile multipartFile) {
        return ErrorCodeEnum.SUCCESS.toReturnValue(uploadService.uploadFile(multipartFile, Commons.COMPANY_SIGNATURE_DIRECTORY_URL));
    }


}
