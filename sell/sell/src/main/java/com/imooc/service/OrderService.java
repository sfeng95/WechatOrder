package com.imooc.service;

import com.imooc.dto.OrderDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
public interface OrderService {
    /** 创建订单.*/
    OrderDTO create(OrderDTO orderDTO);

    /** 查询单个订单.*/
    OrderDTO findOne(String orderId);

    /** 查询所有订单.*/
    Page<OrderDTO> findAll(String buyerOpenid, Pageable pageable);

    /** 取消订单.*/
    OrderDTO cancel(OrderDTO orderDTO);

    /** 完结订单.*/
    OrderDTO finished(OrderDTO orderDTO);

    /** 支付订单.*/
    OrderDTO paid(OrderDTO orderDTO);

    /** 查询订单列表.*/
    Page<OrderDTO> findList(Pageable pageable);
}
