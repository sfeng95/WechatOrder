package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@Getter
@AllArgsConstructor
public enum PayStatusEnums {
    WAIT(0,"等待支付"),
    SUCCESS(1,"支付成功");

    private int code;
    private String msg;
}
