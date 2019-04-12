package com.imooc.controller;

import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.awt.print.Pageable;
import java.util.Map;

/**
 * created by jiangzuole on 2019/4/3 0003.
 */
@Controller
@RequestMapping("/seller/order")
public class SellerOrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/list")
    public ModelAndView findList(@RequestParam(value = "page",defaultValue="0") Integer page,
                                 @RequestParam(value = "size",defaultValue = "10") Integer size,
                                 Map<String,Object> map){
        PageRequest request = new PageRequest(page,size);
        Page<OrderDTO> orderDTOS = orderService.findList(request);
        orderDTOS.getTotalElements();
        orderDTOS.getTotalPages();
        map.put("orderDTOS",orderDTOS);
        map.put("page",page);
        map.put("size",size);
        return new ModelAndView("/list",map);
    }
}
