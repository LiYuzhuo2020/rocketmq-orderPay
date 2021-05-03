package com.order.service;

import com.common.result.Result;
import com.simpleShop.pojo.Order;

/**
 * @Author: drainli
 * @Description: direct by LiYuzhuo
 * @Date: 2021/5/2 22:23
 **/
public interface IOrderService {

    /**
     *  下单业务
     * @param order
     * @return
     */
    Result confirmOrder(Order order) ;

}
