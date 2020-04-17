package com.tsps.material.controller;

import com.tsps.common.Commons;
import com.tsps.common.ErrorStatusEnum;
import com.tsps.common.ResultBean;
import com.tsps.material.dto.BasicInformationDTO;
import com.tsps.material.dto.CompanyInformationDTO;
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
        return ErrorStatusEnum.SUCCESS.toReturnValue(companyInformationService.getBasicInformation(companyId));
    }

    @GetMapping(value = "/companyInformation/{companyId}")
    @ResponseBody
    public ResultBean getCompanyInformation(@PathVariable Integer companyId){
        return ErrorStatusEnum.SUCCESS.toReturnValue(companyInformationService.getCompanyInformation(companyId));
    }

    @PostMapping(value = "/basicInformation")
    @ResponseBody
    public ResultBean updateBasicInformation(@RequestBody @Valid BasicInformationDTO basicInformationDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.updateBasicInformation(basicInformationDTO);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @PostMapping(value = "/companyInformation")
    @ResponseBody
    public ResultBean updateCompanyInformation(@RequestBody @Valid CompanyInformationDTO companyInformationDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorStatusEnum.FAIL.toReturnValue(bindingResult);
        }
        companyInformationService.updateCompanyInformation(companyInformationDTO);
        return ErrorStatusEnum.SUCCESS.toReturnValue();
    }

    @PostMapping("/upload/identityPhoto")
    @ResponseBody
    public ResultBean uploadIdentityPhoto(MultipartFile multipartFile) {
        return ErrorStatusEnum.SUCCESS.toReturnValue(uploadService.uploadImage(multipartFile, Commons.IDENTITY_PHOTOS_DIRECTORY_URL));
    }

    @PostMapping("/upload/businessLicensePhoto")
    @ResponseBody
    public ResultBean uploadBusinessLicensePhoto(MultipartFile multipartFile) {
        return ErrorStatusEnum.SUCCESS.toReturnValue(uploadService.uploadImage(multipartFile, Commons.BUSINESS_LICENSE_PHOTO_DIRECTORY_URL));
    }

    @PostMapping("/upload/companySignature")
    @ResponseBody
    public ResultBean uploadCompanySignature(MultipartFile multipartFile) {
        return ErrorStatusEnum.SUCCESS.toReturnValue(uploadService.uploadImage(multipartFile, Commons.COMPANY_SIGNATURE_DIRECTORY_URL));
    }


}
