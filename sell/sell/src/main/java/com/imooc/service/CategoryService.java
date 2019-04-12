package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * created by jiangzuole on 2019/3/24 0024.
 */
public interface CategoryService {
    /** 查单一. */
    ProductCategory findOne(Integer categoryId);

    /** 查所有. */
    List<ProductCategory> findAll();

    /** 根据类目编号查询. */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);

    /** 新建类目.*/
    ProductCategory save(ProductCategory productCategory) throws Exception;
}
