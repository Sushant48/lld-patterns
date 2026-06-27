package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;

public class RetryDecorator extends NotificationDecorator {

    private BaseNotification baseNotification;
    private int attempt;

    public RetryDecorator(BaseNotification baseNotification){
        this.baseNotification = baseNotification;
    }

    @Override
    public String sendNotification() {
        baseNotification.sendNotification();
        return String.format("Notification sent successfully | retry attempt: %s", attempt);
    }
}
