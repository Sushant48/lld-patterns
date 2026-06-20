package sushant.lldPatterns.observerPattern.orderNotificationSystem.observable;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.Observer;

public interface Observable {
    void addObserver(Observer order);
    void removerObserver(Observer order);

    void notifyObserver(Order order);
}
