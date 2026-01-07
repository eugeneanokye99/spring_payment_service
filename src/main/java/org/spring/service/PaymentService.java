package org.spring.service;

import org.spring.repository.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    @Autowired
    public PaymentService(@Qualifier("creditCardProcessor") PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void setPaymentProcessor(double amount) {
        System.out.println("PaymentService: Initiating payment...");
        paymentProcessor.processPayment(amount);
        System.out.println("PaymentService: Payment completed!");
    }
}
