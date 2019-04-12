package com.imooc.Repository;

import com.imooc.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by jiangzuole on 2019/3/22 0022.
 */
public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Integer> {
   List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
}
