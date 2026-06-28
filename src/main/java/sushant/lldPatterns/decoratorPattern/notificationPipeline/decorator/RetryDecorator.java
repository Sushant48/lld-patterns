package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;
import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.NotificationService;

public class RetryDecorator extends NotificationDecorator {

    private int attempt;

    public RetryDecorator(NotificationService notificationService){
        super(notificationService);
    }

    @Override
    public String sendNotification() {
        String result = notificationService.sendNotification();
        attempt++;
        return String.format("Notification sent successfully | retry attempt: %s | result: %s", attempt,result);
    }
}
