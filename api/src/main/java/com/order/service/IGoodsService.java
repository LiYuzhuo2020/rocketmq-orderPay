package com.order.service;


import com.common.result.Result;
import com.simpleShop.pojo.Goods;
import com.simpleShop.pojo.GoodsNumberLog;

/**
 * @Author: drainli
 * @Description: direct by LiYuzhuo
 * @Date: 2021/5/3 16:12
 **/
public interface IGoodsService {

    /**
     * 根据ID查询商品对象
     * @param goodsId
     * @return
     */
    Goods findOne(Long goodsId);

    /**
     * 扣减库存
     * @param goodsNumberLog
     * @return
     */
    Result reduceGoodsNum(GoodsNumberLog goodsNumberLog);

}
