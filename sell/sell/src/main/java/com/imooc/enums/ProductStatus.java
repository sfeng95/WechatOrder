package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * created by jiangzuole on 2019/3/26 0026.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ProductStatus {

    UP(0,"上架"),
    DOWN(1,"下架"),
    ;

    private int code;
    private String msg;

}
