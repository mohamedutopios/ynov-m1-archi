package org.example.structural.tp.decorator;

public class BasicNotificationService implements NotificationService {

    @Override
    public void send(String message) {
        System.out.println("Envoi de la notification : " + message);
    }
}
