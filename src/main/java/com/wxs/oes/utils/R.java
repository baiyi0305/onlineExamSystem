package com.wxs.oes.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:Adolph
 * <p>
 *     将结果包装，统一返回
 * </p>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 信息描述
     */
    private String message;
    /**
     * 数据信息
     */
    private T data;


}
