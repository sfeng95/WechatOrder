package com.imooc.Repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * created by jiangzuole on 2019/3/22 0022.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void test(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("商品");
        productCategory.setCategoryType(111);
        ProductCategory category = repository.save(productCategory);
        System.out.println(category);
    }

    @Test
    public void test2(){
        ProductCategory category = repository.findOne(1);
        System.out.println(category.toString());
    }

    @Test
    public void test3(){

        for (int i=0;i<10;i++){
            ProductCategory productCategory = new ProductCategory();
            productCategory.setCategoryName("热销榜"+i);
            productCategory.setCategoryType(i);
            repository.save(productCategory);
        }

    }

    @Test
    public void test4(){
        for (int i=0;i<13;i++){
            repository.delete(i+2);
        }

    }

    /*@Test
    @Transactional
    public void test5(){
        List<Integer> list = Arrays.asList(2,3,4);
        List<ProductCategory> result = repository.findByCategoryType();
        System.out.println(result);
    }*/

}