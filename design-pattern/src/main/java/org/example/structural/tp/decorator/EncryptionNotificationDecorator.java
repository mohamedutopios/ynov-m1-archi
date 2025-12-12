package org.example.structural.tp.decorator;

public class EncryptionNotificationDecorator
        extends NotificationDecorator {

    public EncryptionNotificationDecorator(
            NotificationService notificationService) {
        super(notificationService);
    }

    @Override
    public void send(String message) {
        String encryptedMessage = encrypt(message);
        super.send(encryptedMessage);
    }

    private String encrypt(String message) {
        return new StringBuilder(message).reverse().toString();
    }
}