package paymentsystem.app;

import paymentsystem.impl.CreditCardPayment;
import paymentsystem.impl.UpiPayment;
import paymentsystem.payment.Payment;

public class Main {
    public static void main(String[] args) {
        UpiPayment upiPayment = new UpiPayment();
        upiPayment.pay(1000);
        upiPayment.refund(200);

        System.out.println("---------------------------");

        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(5000);
        creditCardPayment.refund(1000);

        System.out.println("---------------------------");
        System.out.println("----------------------------");


        // Using Payment interface reference
        Payment payment = new UpiPayment();
        payment.pay(1500);
        payment.refund(5000);

        System.out.println("---------------------------");
        Payment payment2 = new CreditCardPayment();
        payment2.pay(5000);
        payment2.refund(5000);

    }
}