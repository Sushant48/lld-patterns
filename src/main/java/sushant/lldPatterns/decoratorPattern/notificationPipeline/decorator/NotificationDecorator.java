package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.NotificationService;

public abstract class NotificationDecorator extends NotificationService {
    protected NotificationService notificationService;

    public NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
