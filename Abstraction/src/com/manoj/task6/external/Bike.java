package com.manoj.task6.external;

import com.manoj.task6.Vehicle;

public class Bike implements Vehicle {
    @Override
    public void service() {
        System.out.println("Servicing a bike");
    }
}
