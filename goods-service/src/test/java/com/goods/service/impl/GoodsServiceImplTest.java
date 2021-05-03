package com.goods.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.goods.IGoodsServiceApplication;
import com.goods.IGoodsServiceApplicationTest;
import com.order.service.IGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;

/**
 * @Author: drainli
 * @Description:
 * @Date: 2021/5/3 20:09
 **/
@Slf4j
public class GoodsServiceImplTest extends IGoodsServiceApplicationTest {

    @Autowired private IGoodsService goodsService ;

    @Test
    public void findOneGoodsById(){

        log.info("find goods: " + JSON.toJSONString(ObjectUtils.isEmpty(goodsService.findOne(123l))?"empty":goodsService.findOne(123l)));

    }

}
