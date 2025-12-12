package org.example.structural.adpater.tp.exercice1;

public class Client {
    public static void main(String[] args) {
        OldPaymentGateway paymentGateway = new NewPaymentAdapter();
        paymentGateway.makePayment("132243", 100);
    }

}
