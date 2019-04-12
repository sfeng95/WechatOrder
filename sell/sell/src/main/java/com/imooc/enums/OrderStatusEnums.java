package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@AllArgsConstructor
@Getter
public enum OrderStatusEnums {
    NEW(0,"新下单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private int code;
    private String msg;

}
