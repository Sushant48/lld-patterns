package sushant.lldPatterns.strategyPattern.discountEngine.strategy;

public class CouponDiscountStrategy implements DiscountStrategy{
    @Override
    public void applyDiscount() {
        System.out.println("Coupon discount: 5%");
    }
}
