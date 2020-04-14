package com.tsps.content.controller;
import com.tsps.common.Commons;
import com.tsps.common.ErrorCodeEnum;
import com.tsps.common.ResultBean;
import com.tsps.content.dto.AddGovernmentFileDTO;
import com.tsps.content.service.GovernmentFileManageService;
import com.tsps.util.upload.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/18：07
 *  *  * @description : 政府文件控制器
 *  *  * @modified :
 */

@RequestMapping("/government_file")
@Controller
public class GovernmentFileManageController {
    @Autowired
    private UploadService uploadService;
    @Autowired
    private GovernmentFileManageService governmentFileManageService;

    @PostMapping("/upload")
    @ResponseBody
    public ResultBean uploadGovernmentFile(MultipartFile multipartFile){
        return ErrorCodeEnum.SUCCESS.toReturnValue(uploadService.uploadFile(multipartFile, Commons.GOVERNMENT_FILE_DIRECTORY_URL));
    }
    @PostMapping("/addGovernmentFile")
    @ResponseBody
    public ResultBean addGovernmentFile(@RequestBody @Valid AddGovernmentFileDTO addGovernmentFileDTO, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ErrorCodeEnum.FAIL.toReturnValue();
        }
        return governmentFileManageService.addGovernmentFile(addGovernmentFileDTO);
    }
    @PostMapping("/deleteGovernmentFile/{id}")
    @ResponseBody
    public ResultBean deleteGovernmentFile(@PathVariable Integer id){
        return governmentFileManageService.deleteGovernmentFile(id);
    }
    @PostMapping("/getGovernmentFileList/{type}")
    @ResponseBody
    public ResultBean getGovernmentFileList(@PathVariable String type){
        return governmentFileManageService.getGovernmentFileList(type);
    }

}
