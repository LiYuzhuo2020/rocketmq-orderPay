package com.order.service;

import com.common.result.Result;
import com.simpleShop.pojo.User;
import com.simpleShop.pojo.UserAmountLog;

/**
 * @Author: drainli
 * @Description: 用户服务类
 * @Date: 2021/5/3 16:27
 **/
public interface IUserService {

    User findOne(Long userId);

    Result updateMoneyPaid(UserAmountLog userAmountLog);

}
