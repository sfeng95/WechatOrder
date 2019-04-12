package com.imooc.dataobject;

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
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单Id.*/
    private String orderId;

    /** 商品Id.*/
    private String productId;

    /** 商品名称.*/
    private String productName;

    /** 商品价格.*/
    private BigDecimal productPrice;

    /** 商品数量.*/
    private Integer productQuantity;

    /** 商品图片.*/
    private String productIcon;

}
