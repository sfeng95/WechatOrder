package com.imooc.service.impl;

import com.imooc.dataobject.ProductInfo;
import com.imooc.service.ProductInfoService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * created by jiangzuole on 2019/3/26 0026.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductInfoServiceImplTest {

    @Autowired
    private ProductInfoService service;

    @Test
    public void findOne() {
        ProductInfo result = service.findOne("1");
        Assert.assertNotEquals(null,result);
        System.out.println(result);
    }

    @Test
    public void findUpAll() {
        List<ProductInfo> upAll = service.findUpAll();
        Assert.assertNotEquals(null, upAll);
        System.out.println(upAll);
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(1,1);
        Page<ProductInfo> page = service.findAll(request);
        long totalElements = page.getTotalElements();
        int pages = page.getTotalPages();
        System.out.println("总页数："+pages+"每页多少条数据："+totalElements);
    }

    @Test
    public void update() {
    }
}