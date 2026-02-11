package paymentsystem.impl;

import paymentsystem.payment.Payment;

public class UpiPayment implements Payment {
    @Override
    public boolean pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
        return true;
    }

}
