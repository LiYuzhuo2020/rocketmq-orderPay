package com.order.service;

import com.common.result.Result;
import com.simpleShop.pojo.Coupon;

/**
 * @Author: drainli
 * @Description: direct by LiYuzhuo
 * @Date: 2021/5/3 16:28
 **/
public interface ICouponService {
    /**
     * 根据ID查询优惠券对象
     * @param coupouId
     * @return
     */
    public Coupon findOne(Long coupouId);

    /**
     * 更细优惠券状态
     * @param coupon
     * @return
     */
    Result updateCouponStatus(Coupon coupon);

    /**
     * 添加优惠券
     * @param coupon
     * @return
     */
    Result addOneCoupon(Coupon coupon ) ;
}
