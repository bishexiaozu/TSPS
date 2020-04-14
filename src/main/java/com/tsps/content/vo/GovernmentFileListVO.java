package com.tsps.content.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/18：26
 *  *  * @description : 政府文件列表返回类
 *  *  * @modified :
 */

@Data
public class GovernmentFileListVO implements Serializable {
    private static final long serialVersionUID = 1;

    private int id;
    private String title;
    private Date time;
    private String path;

}
