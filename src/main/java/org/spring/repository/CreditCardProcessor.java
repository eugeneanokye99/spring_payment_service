package org.spring.repository;

public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Processor Processing Payment");
    }
}
