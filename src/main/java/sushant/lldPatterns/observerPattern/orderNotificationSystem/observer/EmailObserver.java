package sushant.lldPatterns.observerPattern.orderNotificationSystem.observer;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;

public class EmailObserver implements Observer{
    @Override
    public void update(Order order) {
        sendMail(order);
    }

    private void sendMail(Order order){
        System.out.println(String.format("Mail sent for orderId: %s",order.getOrderId()));
    }
}
