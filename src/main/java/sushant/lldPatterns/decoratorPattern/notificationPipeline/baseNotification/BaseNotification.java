package sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification;

public class BaseNotification extends NotificationService{

    @Override
    public String sendNotification() {
        return "order saved";
    }
}
