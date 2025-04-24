package com.manoj.task6.external;

import com.manoj.task6.Payment;

public class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment done using Credit Card");
    }
}
