package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.NotificationService;

public class LoggingDecorator extends NotificationDecorator {

    public LoggingDecorator(NotificationService notificationService){
        super(notificationService);
    }

    @Override
    public String sendNotification() {
        System.out.println("Request started");
        String result = notificationService.sendNotification();
        System.out.println("Request completed");
        return result;
    }
}