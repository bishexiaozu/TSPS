package com.tsps.content.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/22：37
 *  *  * @description : 企业文件返回类
 *  *  * @modified :
 */

@Data
public class AssessmentFileListVO implements Serializable {
    private static final long serialVersionUID = 1;
    private Integer id;
    private String title;
    private Date time;
    private String path;
}
