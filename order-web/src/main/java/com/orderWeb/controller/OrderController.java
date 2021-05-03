package com.orderWeb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.common.result.Result;
import com.order.service.IOrderService;
import com.simpleShop.pojo.Order;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: drainli
 * @Description: 订单支付web端
 * @Date: 2021/5/3 21:25
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    @Reference private IOrderService orderService ;

    /**
     *  确认订单
     * @return
     */
    @RequestMapping("/confirm")
    public Result confirmOrder(@RequestBody Order order) {
        return orderService.confirmOrder(order) ;
    }

}
