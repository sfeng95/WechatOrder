package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnums;
import com.imooc.enums.PayStatusEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {
    private String orderId;

    /** 买家姓名.*/
    private String buyerName;

    /** 买家手机号.*/
    private String buyerPhone;

    /** 买家地址.*/
    private String buyerAddress;

    /** 买家openId.*/
    private String buyerOpenid;

    /** 订单总金额.*/
    private BigDecimal orderAmount;

    /** 订单状态.*/
    private Integer orderStatus;

    /** 支付状态.*/
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}
