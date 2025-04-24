package com.manoj.task6.runner;


import com.manoj.task6.Vehicle;
import com.manoj.task6.external.Automobile;
import com.manoj.task6.external.ServiceCenter;


public class Vehiclerunner {
    public static void main(String[] args) {
        Vehicle vehicle=new Automobile();
        ServiceCenter serviceCenter=new ServiceCenter(vehicle);
        serviceCenter.performService();

    }
}
