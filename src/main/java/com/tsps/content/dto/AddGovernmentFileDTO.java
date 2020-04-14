package com.tsps.content.dto;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 *  * @author : luxinnan
 *  *  * @date : 2020/4/10/18：22
 *  *  * @description : 政府文件接收类
 *  *  * @modified :
 */

@Data
public class AddGovernmentFileDTO implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull(message = "文件标题")
    private String title;

    @NotNull(message = "文件路径")
    private String path;

    @NotNull(message = "文件类型")
    private String type;
}
