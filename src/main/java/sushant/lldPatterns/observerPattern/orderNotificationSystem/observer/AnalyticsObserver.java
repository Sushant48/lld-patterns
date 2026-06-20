package sushant.lldPatterns.observerPattern.orderNotificationSystem.observer;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;

import java.math.BigDecimal;

public class AnalyticsObserver implements Observer{

    public static int orderCount = 0;
    public static BigDecimal revenue = BigDecimal.valueOf(0);

    @Override
    public void update(Order order) {
        doAnalytics(order);
    }

    private void doAnalytics(Order order) {
        orderCount++;
        revenue = revenue.add(order.getAmount());
        System.out.println(String.format("Analytics updated for orderId: %s | orderCount: %d | revenue: %f",order.getOrderId(), orderCount, revenue ));
    }
}
