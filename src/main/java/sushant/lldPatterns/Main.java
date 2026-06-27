package sushant.lldPatterns;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;
import sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator.EncryptDecorator;
import sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator.LoggingDecorator;
import sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator.RetryDecorator;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.model.Order;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observable.Observable;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observable.OrderService;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observable.OrderServiceImpl;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.AnalyticsObserver;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.EmailObserver;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.InventoryObserver;
import sushant.lldPatterns.observerPattern.orderNotificationSystem.observer.Observer;
import sushant.lldPatterns.observerPattern.weatherStation.observable.TemperatureObservable;
import sushant.lldPatterns.observerPattern.weatherStation.observer.Display;
import sushant.lldPatterns.observerPattern.weatherStation.observer.MobileDisplay;
import sushant.lldPatterns.observerPattern.weatherStation.observer.WebDisplay;
import sushant.lldPatterns.strategyPattern.discountEngine.service.CheckoutService;
import sushant.lldPatterns.strategyPattern.discountEngine.service.CouponDiscount;
import sushant.lldPatterns.strategyPattern.discountEngine.service.FestivalDiscount;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        System.out.println("----------------Observer---------------");
        weatherStation();
        orderNotificationSystem();

        System.out.println("-------------Strategy------------------");
        discountEngine();

        System.out.println("-------------Decorator------------------");
        notificationPipeline();
    }

    private static void notificationPipeline() {
        BaseNotification baseNotification = new LoggingDecorator(
                new EncryptDecorator(
                        new RetryDecorator(
                                new BaseNotification()
                        )
                )
        );

        baseNotification.sendNotification();
    }

    private static void discountEngine() {
        CheckoutService festivalDiscount = new FestivalDiscount();
        CheckoutService couponDiscount = new CouponDiscount();

        festivalDiscount.applyDiscount();
        couponDiscount.applyDiscount();
    }

    private static void weatherStation() {
        TemperatureObservable tempObservable = new TemperatureObservable();

        Display observer1 = new MobileDisplay(tempObservable);
        Display observer2 = new WebDisplay(tempObservable);

        tempObservable.add(observer1);
        tempObservable.add(observer2);

        tempObservable.setData(10);
        tempObservable.setData(20);
        tempObservable.setData(20);
        tempObservable.setData(30);
    }

    private static void orderNotificationSystem() {
        Order order1 = new Order("1","Sushant", BigDecimal.valueOf(1000));
        Order order2 = new Order("2","Sushant", BigDecimal.valueOf(1000));
        Order order3 = new Order("3","Sushant", BigDecimal.valueOf(1000));
        Order order4 = new Order("4","Sushant", BigDecimal.valueOf(1000));

        OrderService orderService = new OrderServiceImpl();
        Observer ob1 = new EmailObserver();
        Observer ob2 = new InventoryObserver();
        Observer ob3 = new AnalyticsObserver();

        orderService.addObserver(ob1);
        orderService.addObserver(ob2);
        orderService.addObserver(ob3);

        orderService.placeOrder(order1);
        System.out.println();
        orderService.placeOrder(order2);
        System.out.println();

        orderService.placeOrder(order3);
        System.out.println();

        orderService.placeOrder(order4);
        System.out.println();

    }
}