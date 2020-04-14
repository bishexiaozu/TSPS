package com.tsps.util.upload;

import com.tsps.common.ErrorCodeEnum;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 20:12
 * @description:
 * @modified :
 */
@Service
public class UploadServiceImpl implements UploadService {

    public String uploadFile(MultipartFile multipartFile, String rootPath){
        if(multipartFile.isEmpty()){
            return ErrorCodeEnum.FILE_IS_EMPTY.getMsg();
        }
        String fileUrl = null;
        String originalName = multipartFile.getOriginalFilename();
        String uuidName = UUID.randomUUID().toString();
        fileUrl = rootPath  + uuidName + originalName.substring(originalName.lastIndexOf("."));
        File file = new File(fileUrl);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileUrl;
    }

}
