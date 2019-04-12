package com.imooc.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@AllArgsConstructor
@Getter
public enum  ResultEnums {
    PRODUCT_NOT_EXIT(10,"商品不存在"),
    STOCK_ERROR(11,"库存错误"),
    ORDER_NOT_EXIT(12,"订单不存在"),
    ORDER_STATUS_ERROR(13,"订单状态不正确"),
    PAY_STATUS_ERROR(14,"支付状态异常"),
    SUCCESS(0,"成功"),
    PARAM_ERROR(1,"参数不正确"),
    OBJECT_CONVERT_ERROR(2,"对象转换错误"),
    CART_NEVER_EMPTY(3,"购物车不能为空"),
    OPENID_ERROR(4,"openid不存在"),
    ORDERDETAIL_NOT_EXIST(5,"订单详情不存在")
    ;

    private Integer code;

    private String msg;


}
