package com.imooc.exception;

import com.imooc.enums.ResultEnums;
import lombok.Getter;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@Getter
public class SellException extends RuntimeException {
    private Integer code;
    private String msg;

    public SellException(ResultEnums resultEnums) {
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

    public SellException(Integer code,String msg) {
        super(msg);
        this.msg = msg;
        this.code=code;
    }
}
