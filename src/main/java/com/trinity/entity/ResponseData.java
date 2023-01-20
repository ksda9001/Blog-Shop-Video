package com.trinity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//映射后台传入数据
//向前端传入200等处理情况
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData<T> {
    //响应状态码
    private Integer code;
    //响应描述
    private String message;
    //响应数据
    private T data;
}
