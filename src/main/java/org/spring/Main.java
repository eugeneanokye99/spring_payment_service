package org.spring;


import org.spring.config.AppConfig;
import org.spring.service.PaymentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        PaymentService paymentService = context.getBean(PaymentService.class);

        paymentService.setPaymentProcessor(1000);

        context.close();
    }
}
