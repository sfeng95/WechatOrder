package com.imooc.service;

import com.imooc.dataobject.ProductInfo;
import com.imooc.dto.CartDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * created by jiangzuole on 2019/3/25 0025.
 */
public interface ProductInfoService {

    ProductInfo findOne(String productId);

    /** 查询所有在架商品列表.*/
    List<ProductInfo> findUpAll();

    /** 查所有商品.*/
    Page<ProductInfo> findAll(Pageable pageable);

    /** 加库存.*/
    void increase(List<CartDTO> cartDTOList);

    /** 减库存.*/
    void decrease(List<CartDTO> cartDTOList);

    /** 上架.*/
    //TODO

    /** 下架.*/
    //TODO

    /** 修改商品.*/
    ProductInfo update(ProductInfo productInfo);


}
