package com.imooc.dto;

import lombok.Data;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@Data
public class CartDTO {
    /** 商品Id.*/
    private String productId;

    /** 商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
