package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;

public class EncryptDecorator extends NotificationDecorator {

    private BaseNotification baseNotification;
    private final String ENCRYPTMESSAGE = "notification encrypted | previous: %s | encrypted: ****";

    public EncryptDecorator(BaseNotification baseNotification) {
        this.baseNotification = baseNotification;
    }
    @Override
    public String sendNotification() {
        return String.format(ENCRYPTMESSAGE, baseNotification.sendNotification());
    }
}
