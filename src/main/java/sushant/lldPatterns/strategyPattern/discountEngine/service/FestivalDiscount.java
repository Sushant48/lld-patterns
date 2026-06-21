package sushant.lldPatterns.strategyPattern.discountEngine.service;

import sushant.lldPatterns.strategyPattern.discountEngine.strategy.FestivalDiscountStrategy;

public class FestivalDiscount extends CheckoutService{

    public FestivalDiscount(){
        super(new FestivalDiscountStrategy());
    }
}
