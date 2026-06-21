package sushant.lldPatterns.strategyPattern.discountEngine.service;

import sushant.lldPatterns.strategyPattern.discountEngine.strategy.CouponDiscountStrategy;

public class CouponDiscount extends CheckoutService{

    public CouponDiscount(){
        super(new CouponDiscountStrategy());
    }
}
