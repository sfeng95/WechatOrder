package com.imooc.dataobject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * created by jiangzuole on 2019/3/25 0025.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_info")
public class ProductInfo {

    @Id
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDesc;

    private String productIcon;

    private Integer productStatus;

    private Integer categoryType;

}
