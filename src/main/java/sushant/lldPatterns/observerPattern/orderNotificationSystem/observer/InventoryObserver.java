package sushant.lldPatterns.observerPattern.orderNotificationSystem.observer;

import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;

public class InventoryObserver implements Observer{

    public static int productQuantity = 10;
    @Override
    public void update(Order order) {
        updateInverntory(order);
    }

    private void updateInverntory(Order order) {
        productQuantity--;
        System.out.println(String.format("Inventory updated for orderId: %s | productQuantity: %s",order.getOrderId(), productQuantity));
    }
}
