package org.example.structural.tp.decorator;

public class TimingNotificationDecorator
        extends NotificationDecorator {

    public TimingNotificationDecorator(
            NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String message) {
        long start = System.currentTimeMillis();
        super.send(message);
        long end = System.currentTimeMillis();
        System.out.println("[TIMING] Durée d’envoi : " + (end - start) + " ms");
    }
}
