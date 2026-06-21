package sushant.lldPatterns.strategyPattern.discountEngine.strategy;

public class FestivalDiscountStrategy implements DiscountStrategy{
    @Override
    public void applyDiscount() {
        System.out.println("Festival discount: 10%");
    }
}
