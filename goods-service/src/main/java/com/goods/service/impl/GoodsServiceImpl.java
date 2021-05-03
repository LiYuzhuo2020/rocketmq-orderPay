package com.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.result.Result;
import com.goods.mapper.GoodsMapper;
import com.order.service.IGoodsService;
import com.simpleShop.pojo.Goods;
import com.simpleShop.pojo.GoodsNumberLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: drainli
 * @Description: 商品服务实现类
 * @Date: 2021/5/3 16:15
 **/
@Service(interfaceClass = IGoodsService.class)
@Component
public class GoodsServiceImpl implements IGoodsService {

    @Autowired private GoodsMapper goodsMapper ;

    @Override
    public Goods findOne(Long goodsId) {
        return goodsMapper.selectByPrimaryKey(goodsId);
    }

    @Override
    public Result reduceGoodsNum(GoodsNumberLog goodsNumberLog) {
        return null;
    }

}
