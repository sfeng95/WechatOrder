package com.imooc.enums;

import lombok.Getter;

/**
 * created by jiangzuole on 2019/3/24 0024.
 */
@Getter
public enum CategoryEnums {
    HAVE_SAME_CATEGORY(0,"有相同的类目存在"),
    HAVE_SAME_PRODUCT_EXIT(1,"有相同商品存在")
    ;


    private int code;
    private String msg;

    @Override
    public String toString() {
        return "CategoryEnums{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    CategoryEnums(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }}
