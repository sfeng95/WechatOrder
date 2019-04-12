package com.imooc.service.impl;

import com.imooc.Repository.OrderMasterRepository;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * created by jiangzuole on 2019/3/30 0030.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderServiceImplTest {

    @Autowired
    private OrderService service;

    @Autowired
    private OrderMasterRepository orderMasterRepository;


    @Test
    public void create() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("老王");
        orderDTO.setBuyerAddress("芳华苑");
        orderDTO.setBuyerPhone("12345678901");
        orderDTO.setBuyerOpenid("abc123");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(10);
        orderDetailList.add(o1);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDTO result = service.create(orderDTO);
        System.out.println(result);

    }

    @Test
    public void findOne(){
        OrderDTO orderDTO = service.findOne("1554171957761548314");
        Assert.assertNotNull(orderDTO);
        System.out.println(orderDTO);
    }

   
}