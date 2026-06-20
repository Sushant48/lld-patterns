package sushant.lldPatterns.observerPattern.orderNotificationSystem.observable;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObserver(Order observer);
}
