package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnums;
import com.imooc.enums.PayStatusEnums;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order_master")
public class OrderMaster {

    @Id
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
    private Integer orderStatus = OrderStatusEnums.NEW.getCode();

    /** 支付状态.*/
    private Integer payStatus = PayStatusEnums.WAIT.getCode();


}
