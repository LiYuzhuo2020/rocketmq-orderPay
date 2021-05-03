package com.order.service;

import com.common.result.Result;
import com.simpleShop.pojo.OrderPay;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @Author: drainli
 * @Description: direct by LiYuzhuo
 * @Date: 2021/5/3 16:28
 **/
public interface IPayService {

    public Result createPayment(OrderPay orderPay);

    public Result callbackPayment(OrderPay orderPay) throws InterruptedException, RemotingException, MQClientException, MQBrokerException;
}
