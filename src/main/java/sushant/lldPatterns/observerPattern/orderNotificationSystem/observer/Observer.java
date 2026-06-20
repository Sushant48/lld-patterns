package sushant.lldPatterns.observerPattern.orderNotificationSystem.observer;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;

public interface Observer {
    void update(Order order);
}
