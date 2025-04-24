package com.manoj.task6.runner;

import com.manoj.task6.Payment;
import com.manoj.task6.external.OnlineShopping;
import com.manoj.task6.external.UPI;

public class Paymentrunner {
    public static void main(String[] args) {
        Payment payment=new UPI();
        OnlineShopping onlineShopping=new OnlineShopping(payment);
        onlineShopping.checkout();
    }
}
