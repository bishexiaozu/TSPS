package com.tsps.common;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *  *@author : luxinnan
 *  * @date : 2020/4/10 17:56
 *  * @description : 文件存储路径
 *  * @modified :
 */

@Data
public class Commons {
    public static final String GOVERNMENT_FILE_DIRECTORY_URL = "/usr/local/src/TSPS/government_file/";
    public static final String ASSESSMENT_FILE_DIRECTORY_URL = "/usr/local/src/TSPS/assessment_file/";
    public static final String IDENTITY_PHOTOS_DIRECTORY_URL = "/usr/local/src/TSPS/identity_photos/";
    public static final String BUSINESS_LICENSE_PHOTO_DIRECTORY_URL = "/usr/local/src/TSPS/business_license_photos/";
    public static final String COMPANY_SIGNATURE_DIRECTORY_URL = "/usr/local/src/TSPS/company_signature/";

    public static final String PNG = ".png";
    public static final String JPG = ".jpg";
    public static final String JPEG = ".jpeg";

    public static final String IMAGE_URL = "/images";

    public static final String FILE_URL = "http://47.112.249.166:8081/";

    public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd");

    public static final String SELF_ASSESSMENT_DETAILS = "selfAssessmentDetails:";

    public static final String LAST_MONTH_ASSESSMENT_DETAILS = "lastMonthSelfAssessmentDetails:";

    public static final int REDIS_TIME = 60 * 60 * 24 * 15;

    public static final ArrayList<String> URL = new ArrayList<>(Arrays.asList("/TSPSv3/login/company", "/TSPSv3/login/employee",
            "/TSPSv3/login/driver", "/TSPSv3/login/regulator", "/TSPSv3/companyRegister"));
}
