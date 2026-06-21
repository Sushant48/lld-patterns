package sushant.lldPatterns.strategyPattern.discountEngine.service;

import sushant.lldPatterns.strategyPattern.discountEngine.strategy.DiscountStrategy;

public class CheckoutService {
    private DiscountStrategy discountStrategy;

    public CheckoutService(DiscountStrategy obj){
        discountStrategy = obj;
    }

    public void applyDiscount() {
        discountStrategy.applyDiscount();
    }
}
