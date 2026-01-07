package org.spring;


import org.spring.repository.CreditCardProcessor;
import org.spring.repository.PaymentProcessor;
import org.spring.service.PaymentService;

public class Main {
    static void main() {

        PaymentProcessor paymentProcessor = new CreditCardProcessor();

        PaymentService paymentService = new PaymentService(paymentProcessor);

        paymentService.setPaymentProcessor(1000);
    }
}
