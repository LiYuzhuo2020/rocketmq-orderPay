package com.coupon.mq;

import com.simpleShop.mapper.CouponMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.spring.annotation.MessageModel;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: drainli
 * @Description: 回退优惠券监听器
 * @Date: 2021/5/3 19:59
 **/
@Slf4j
@Component
@RocketMQMessageListener(
        topic = "${mq.order.topic}",
        consumerGroup = "${mq.order.consumer.group.name}",
        messageModel = MessageModel.BROADCASTING
)
public class CancelCouponListener implements RocketMQListener<MessageExt> {

    @Autowired private CouponMapper couponMapper ;
    /**
     *  优惠券回退实现
     * @param messageExt
     */
    @Override
    public void onMessage(MessageExt messageExt) {
        log.info("开始回退优惠券...");
    }
}
