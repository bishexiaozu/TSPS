package com.tsps.util.upload;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author : YongBiao Liao
 * @date : 2020/4/8 20:12
 * @description:
 * @modified :
 */
public interface UploadService {

     String uploadFile(MultipartFile multipartFile, String rootPath);

    String uploadImage(MultipartFile multipartFile, String rootPath);

}
