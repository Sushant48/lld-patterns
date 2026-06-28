package sushant.lldPatterns.decoratorPattern.notificationPipeline.decorator;

import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.BaseNotification;
import sushant.lldPatterns.decoratorPattern.notificationPipeline.baseNotification.NotificationService;

public class EncryptDecorator extends NotificationDecorator {

    private final String ENCRYPTMESSAGE = "notification encrypted | previous: %s | encrypted: ****";

    public EncryptDecorator(NotificationService notificationService) {
        super(notificationService);
    }
    @Override
    public String sendNotification() {
        String result = notificationService.sendNotification();
        return String.format(ENCRYPTMESSAGE, result);
    }
}
