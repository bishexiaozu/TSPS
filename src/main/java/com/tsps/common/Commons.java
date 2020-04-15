package com.tsps.common;

import lombok.Data;

import java.text.SimpleDateFormat;

/**
 *  *@author : luxinnan
 *  * @date : 2020/4/10 17:56
 *  * @description : 文件存储路径
 *  * @modified :
 */

@Data
public class Commons {
    public static final String GOVERNMENT_FILE_DIRECTORY_URL = "E:\\government_file\\";
    public static final String ASSESSMENT_FILE_DIRECTORY_URL = "E:\\assessment_file\\";
    public static final String IDENTITY_PHOTOS_DIRECTORY_URL = "E:\\identity_photos\\";
    public static final String BUSINESS_LICENSE_PHOTO_DIRECTORY_URL = "E:\\business_license_photos\\";
    public static final String COMPANY_SIGNATURE_DIRECTORY_URL = "E:\\company_signature\\";

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");

}
