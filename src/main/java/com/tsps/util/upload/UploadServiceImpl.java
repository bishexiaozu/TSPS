package com.tsps.util.upload;

import com.tsps.common.Commons;
import com.tsps.common.ErrorStatusEnum;
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
            return ErrorStatusEnum.FILE_IS_EMPTY.getMsg();
        }
        String originalName = multipartFile.getOriginalFilename();
        String fileType = originalName.substring(originalName.lastIndexOf("."));
        return saveFile(multipartFile,rootPath, fileType);
    }

    public String uploadImage(MultipartFile multipartFile, String rootPath){
        if(multipartFile.isEmpty()){
            return ErrorStatusEnum.FILE_IS_EMPTY.getMsg();
        }
        String fileType = multipartFile.getOriginalFilename().substring(multipartFile.getOriginalFilename().lastIndexOf("."));
        if(!Commons.JPEG.equals(fileType) && !Commons.JPG.equals(fileType) && !Commons.PNG.equals(fileType)){
            return ErrorStatusEnum.FILE_TYPE_ERROR.getMsg();
        }
        return saveFile(multipartFile,rootPath, fileType);
    }

    private String saveFile(MultipartFile multipartFile, String rootPath, String fileType){
        String uuidName = UUID.randomUUID().toString();
        String fileUrl = rootPath + uuidName + fileType;
        File file = new File(fileUrl);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int lastIndex = rootPath.lastIndexOf("/");
        int beginIndex = rootPath.lastIndexOf("/",lastIndex-1) + 1;
        fileUrl = Commons.FILE_URL + rootPath.substring(beginIndex,lastIndex + 1) + uuidName + fileType;
        return fileUrl;
    }
}
