package com.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.result.Result;
import com.order.service.IGoodsService;
import com.simpleShop.pojo.Goods;
import com.simpleShop.pojo.GoodsNumberLog;
import org.springframework.stereotype.Component;

/**
 * @Author: drainli
 * @Description: direct by LiYuzhuo
 * @Date: 2021/5/3 16:15
 **/
@Service(interfaceClass = IGoodsService.class)
@Component
public class GoodsServiceImpl implements IGoodsService {

    @Override
    public Goods findOne(Long goodsId) {
        return null;
    }

    @Override
    public Result reduceGoodsNum(GoodsNumberLog goodsNumberLog) {
        return null;
    }

}
