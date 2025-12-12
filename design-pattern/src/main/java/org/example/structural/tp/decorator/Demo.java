package org.example.structural.tp.decorator;

public class Demo {

    public static void main(String[] args) {

        NotificationService notification =
                new BasicNotificationService();

        notification =
                new LoggingNotificationDecorator(notification);

        notification =
                new EncryptionNotificationDecorator(notification);

        notification =
                new TimingNotificationDecorator(notification);

        notification.send("Bonjour utilisateur");
    }
}
