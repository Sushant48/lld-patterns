package sushant.lldPatterns.observerPattern.orderNotificationSystem.observable;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;

public interface OrderService extends Observable{
    void placeOrder(Order order);
}
