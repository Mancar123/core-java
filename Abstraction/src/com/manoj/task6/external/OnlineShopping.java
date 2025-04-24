package com.manoj.task6.external;

import com.manoj.task6.Payment;

public class OnlineShopping {
    private Payment payment;

    public OnlineShopping(Payment payment) {
        System.out.println("Online Shopping started");
        this.payment = payment;
    }

    public void checkout() {
        if (payment != null) {
            payment.pay();
        } else {
            System.out.println("No payment method selected");
        }
    }
}
