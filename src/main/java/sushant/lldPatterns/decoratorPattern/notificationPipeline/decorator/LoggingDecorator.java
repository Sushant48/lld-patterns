package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;

public class LoggingDecorator extends NotificationDecorator {

    private BaseNotification baseNotification;

    public LoggingDecorator(BaseNotification baseNotification){
        this.baseNotification = baseNotification;
    }

    @Override
    public String sendNotification() {
        System.out.println("Request started");
        baseNotification.sendNotification();
        System.out.println("Request completed");
        return "Notification logged successfully";
    }
}