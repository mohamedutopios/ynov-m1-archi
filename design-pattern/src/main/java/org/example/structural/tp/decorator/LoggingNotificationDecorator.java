package org.example.structural.tp.decorator;

public class LoggingNotificationDecorator
        extends NotificationDecorator {

    public LoggingNotificationDecorator(
            NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String message) {
        System.out.println("[LOG] Envoi d’un message");
        super.send(message);
    }
}
