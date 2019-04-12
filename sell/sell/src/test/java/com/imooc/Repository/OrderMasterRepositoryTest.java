package com.imooc.Repository;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import com.imooc.enums.OrderStatusEnums;
import com.imooc.enums.PayStatusEnums;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderMasterRepositoryTest {

    private final String buyerOpenid = "abc123";

    @Autowired
    private OrderMasterRepository repository;

    @Autowired
    private OrderDetailRepository orderDetailRepository;
    @Test
    /**
     * 测试save方法
     */
    public void test(){
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("456789");
        orderMaster.setBuyerOpenid(buyerOpenid);
        orderMaster.setBuyerName("蒋作乐");
        orderMaster.setBuyerPhone("12345678901");
        orderMaster.setBuyerAddress("建邺区江心洲");
        orderMaster.setOrderAmount(new BigDecimal(45.9));
        orderMaster.setOrderStatus(OrderStatusEnums.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnums.WAIT.getCode());
        OrderMaster result = repository.save(orderMaster);
        Assert.assertNotNull(result);
    }

    /**
     *测试通过openid查订单
     */
    @Test
    public void test1(){
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> result = repository.findByBuyerOpenid(buyerOpenid, request);
        System.out.println(result.getTotalElements());
        System.out.println(result.getTotalPages());
        System.out.println(result);
    }

    @Test
    public void test2(){
        OrderMaster orderMaster = repository.findOne("1554171957761548314");
        OrderDetail orderDetail = orderDetailRepository.findOne("1554171957761548314");
        List<OrderDetail> orderDetailList = new ArrayList<>();
        orderDetailList.add(orderDetail);
        System.out.println(orderMaster);
        System.out.println(orderDetailList);
        System.out.println(orderDetail);

        List<OrderDetail> orderDetailList1 = orderDetailRepository.findByOrderId("1554171957761548314");
        System.out.println(orderDetailList1);
    }

    @Test
    public void test3(){
        PageRequest request = new PageRequest(0,2);
        Page<OrderMaster> orderMasterPage = repository.findByBuyerOpenid("abc123", request);
        System.out.println(orderMasterPage.getContent());
    }

    @Test
    public void test4(){
        OrderMaster orderMaster = repository.findByOrderId("1554197687571872178");
        System.out.println(orderMaster);

    }
}