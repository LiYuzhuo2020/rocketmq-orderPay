package com.order.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.exception.CastException;
import com.common.result.GlobalCode;
import com.common.result.Result;
import com.order.service.IGoodsService;
import com.order.service.IOrderService;
import com.order.service.IUserService;
import com.simpleShop.pojo.Goods;
import com.simpleShop.pojo.Order;
import com.simpleShop.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: drainli
 * @Description: 订单业务实现类
 * @Date: 2021/5/2 22:27
 **/
@Slf4j
@Service(interfaceClass = IOrderService.class)
public class IOrderServiceImpl implements IOrderService {

    @Autowired private IGoodsService goodsService ;
    @Autowired private IUserService userService ;


    @Override
    public Result confirmOrder(Order order) {

        //1.校验订单

        //2.生成预订单

        try {

            //3.扣减库存

            //4.扣减优惠券

            //5.使用余额

            //6.确认订单

            //7.返回成功状态

            return Result.success("操作成功") ;
        }catch (Exception e){

            //1.确认订单失败,发送消息

            //2.返回失败状态

            return Result.fail("操作失败") ;
        }
    }

    private void checkOrder(Order order) {
        //1.校验订单是否存在
        if(order==null){
            CastException.cast(GlobalCode.SHOP_ORDER_INVALID);
        }
        //2.校验订单中的商品是否存在
        Goods goods = goodsService.findOne(order.getGoodsId());
        if(goods==null){
            CastException.cast(GlobalCode.SHOP_GOODS_NO_EXIST);
        }
        //3.校验下单用户是否存在
        User user = userService.findOne(order.getUserId());
        if(user==null){
            CastException.cast(GlobalCode.SHOP_USER_NO_EXIST);
        }
        //4.校验商品单价是否合法
        if(order.getGoodsPrice().compareTo(goods.getGoodsPrice())!=0){
            CastException.cast(GlobalCode.SHOP_GOODS_PRICE_INVALID);
        }
        //5.校验订单商品数量是否合法
        if(order.getGoodsNumber()>=goods.getGoodsNumber()){
            CastException.cast(GlobalCode.SHOP_GOODS_NUM_NOT_ENOUGH);
        }

        log.info("校验订单通过");
    }

}
