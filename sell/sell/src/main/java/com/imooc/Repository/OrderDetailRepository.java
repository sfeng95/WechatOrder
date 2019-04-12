package com.imooc.Repository;

import com.imooc.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * created by jiangzuole on 2019/3/28 0028.
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {
    /** 通过订单Id查找订单详情.*/
    List<OrderDetail> findByOrderId(String orderId);
}
