package com.imooc.controller;
import com.imooc.Repository.OrderDetailRepository;
import com.imooc.Repository.OrderMasterRepository;
import com.imooc.converter.OrderForm2OrderDTOConverter;
import com.imooc.converter.OrderMaster2OrderDTOConverter;
import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.ResultEnums;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.service.OrderService;
import com.imooc.utils.ResultVOUtil;
import com.imooc.vo.ResultVO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import javax.validation.Valid;
import java.util.*;

/**
 * created by jiangzuole on 2019/4/2 0002.
 */
@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Autowired
    private OrderMasterRepository orderMasterRepository;
    /**
     * 创建订单
     * @param orderForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/create")
    public ResultVO<Map<String,String>> create(@Valid OrderForm orderForm, BindingResult bindingResult){
        //判断表单提交的参数正确与否
        if (bindingResult.hasErrors()){
            throw new SellException(ResultEnums.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        //判断购物车不能为空
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.converter(orderForm);
        if (CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            throw new SellException(ResultEnums.CART_NEVER_EMPTY);
        }
        OrderDTO dto = orderService.create(orderDTO);
        Map<String,String> map = new HashMap<>();
        map.put("orderId",dto.getOrderId());
        return ResultVOUtil.SUCCESS(map);
    }

    /**
     * 查询订单列表
     */
    @GetMapping("/list")
    public ResultVO<List<OrderDTO>> list(@RequestParam("openid") String openid,
                                         @RequestParam(value = "page", defaultValue ="0" ) Integer page,
                                         @RequestParam(value = "size",defaultValue = "10") Integer size){
        if (StringUtils.isEmpty(openid)){
            log.info("【openid不存在】"+openid);
            throw new SellException(ResultEnums.OPENID_ERROR);
        }

        PageRequest request = new PageRequest(page,size);
        Page<OrderDTO> orderDTOPage = orderService.findAll(openid, request);

        return ResultVOUtil.SUCCESS(orderDTOPage.getContent());
    }

    /**
     * 订单详情
     */
    @GetMapping("/detail")
    public ResultVO<List<OrderDetail>> findDetail(@RequestParam String openid,@RequestParam String orderId){
        OrderDTO orderDTO = orderService.findOne(orderId);
        return ResultVOUtil.SUCCESS(orderDTO);
    }
}
