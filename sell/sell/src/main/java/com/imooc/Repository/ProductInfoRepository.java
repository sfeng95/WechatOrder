package com.imooc.Repository;

import com.imooc.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by jiangzuole on 2019/3/25 0025.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    /** 通过商品状态查询.*/
    List<ProductInfo>  findByProductStatus(Integer productStatus);
}
