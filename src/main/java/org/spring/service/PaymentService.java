package org.spring.service;

import org.spring.repository.PaymentProcessor;

public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void setPaymentProcessor(double amount) {
        System.out.println("PaymentService: Initiating payment...");
        paymentProcessor.processPayment(amount);
        System.out.println("PaymentService: Payment completed!");
    }
}
