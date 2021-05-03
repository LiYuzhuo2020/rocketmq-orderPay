package com.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.common.result.Result;
import com.order.service.IUserService;
import com.user.mapper.UserMapper;
import com.simpleShop.pojo.User;
import com.simpleShop.pojo.UserAmountLog;
import com.simpleShop.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: drainli
 * @Description: 用户服务实现类
 * @Date: 2021/5/3 17:23
 **/
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {

    @Autowired private UserMapper userMapper ;

    @Override
    public User findOne(Long userId) {
        try {
            return userMapper.selectByExample(new UserExample()).get(0);
        }catch (Exception e){
            return null ;
        }

    }

    @Override
    public Result updateMoneyPaid(UserAmountLog userAmountLog) {
        return null;
    }
}
