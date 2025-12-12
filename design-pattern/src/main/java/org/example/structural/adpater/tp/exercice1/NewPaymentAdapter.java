package org.example.structural.adpater.tp.exercice1;

public class NewPaymentAdapter implements OldPaymentGateway {

    private NewPaymentGateway newPaymentGateway;

    public NewPaymentAdapter() {
        newPaymentGateway = new NewPaymentGateway();
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentGateway.authenticate(accountNumber);
        newPaymentGateway.sendPayment(1000);
    }
}
