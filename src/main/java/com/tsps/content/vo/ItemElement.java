package com.tsps.content.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: luxinnan
 * @Date: 2020/5/25 21:24
 * @Discription:
 * @Modified:
 */
@Data
public class ItemElement implements Serializable {
    private static final long serialVersionUID = 1;
    private Integer elementId;
    private Integer itemId;
}
