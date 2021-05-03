package com.simpleShop.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Coupon {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.coupon_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Long couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.coupon_price
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private BigDecimal couponPrice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.user_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.order_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.is_used
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Integer isUsed;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column coupon.used_time
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    private Date usedTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.coupon_id
     *
     * @return the value of coupon.coupon_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.coupon_id
     *
     * @param couponId the value for coupon.coupon_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.coupon_price
     *
     * @return the value of coupon.coupon_price
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.coupon_price
     *
     * @param couponPrice the value for coupon.coupon_price
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.user_id
     *
     * @return the value of coupon.user_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.user_id
     *
     * @param userId the value for coupon.user_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.order_id
     *
     * @return the value of coupon.order_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.order_id
     *
     * @param orderId the value for coupon.order_id
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.is_used
     *
     * @return the value of coupon.is_used
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Integer getIsUsed() {
        return isUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.is_used
     *
     * @param isUsed the value for coupon.is_used
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setIsUsed(Integer isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column coupon.used_time
     *
     * @return the value of coupon.used_time
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public Date getUsedTime() {
        return usedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column coupon.used_time
     *
     * @param usedTime the value for coupon.used_time
     *
     * @mbggenerated Sun May 02 21:10:59 CST 2021
     */
    public void setUsedTime(Date usedTime) {
        this.usedTime = usedTime;
    }
}