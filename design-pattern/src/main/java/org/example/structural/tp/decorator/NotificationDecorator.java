package org.example.structural.tp.decorator;

public abstract class NotificationDecorator
        implements NotificationService {

    protected NotificationService notificationService;

    protected NotificationDecorator(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public void send(String message) {
        notificationService.send(message);
    }
}
