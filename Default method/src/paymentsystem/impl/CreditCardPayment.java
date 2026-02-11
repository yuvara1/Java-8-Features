package paymentsystem.impl;

import paymentsystem.payment.Payment;

public class CreditCardPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
        return true;
    }

    @Override
    public boolean refund(double amount) {
        System.out.println("Refunded ₹" + amount + " to Credit Card");
        return true;
    }
}
