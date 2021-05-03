package com.pay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.result.Result;
import com.order.service.IPayService;
import com.simpleShop.pojo.OrderPay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.springframework.stereotype.Component;

/**
 * @Author: drainli
 * @Description: 支付服务
 * @Date: 2021/5/3 17:19
 **/
@Component
@Service(interfaceClass = IPayService.class)
public class IPayServiceImpl implements IPayService {
    @Override
    public Result createPayment(OrderPay orderPay) {
        return null;
    }

    @Override
    public Result callbackPayment(OrderPay orderPay) throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        return null;
    }
}
