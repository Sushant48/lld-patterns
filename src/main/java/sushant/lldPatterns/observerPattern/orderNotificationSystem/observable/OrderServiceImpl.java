package sushant.lldPatterns.observerPattern.orderNotificationSystem.observable;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer order) {
        observers.add(order);
    }

    @Override
    public void removerObserver(Observer order) {
        observers.remove(order);
    }

    @Override
    public void notifyObserver(Order order) {
        for(Observer observer : observers){
            try{
                observer.update(order);
            } catch (Exception e) {
                System.out.println(String.format("Exception occured while updating observer: %s | exception: %s", observer.getClass().getName(), e));
            }
        }
    }

    @Override
    public void placeOrder(Order order){
        System.out.println(String.format("Oder placed | orderId: %s | name: %s", order.getOrderId() ,order.getName()));
        notifyObserver(order);
    }
}
