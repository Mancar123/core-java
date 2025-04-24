package com.manoj.task6.external;

import com.manoj.task6.Vehicle;

public class ServiceCenter {
    private Vehicle vehicle;

    public ServiceCenter(Vehicle vehicle) {
        System.out.println("Service center started");
        this.vehicle = vehicle;
    }

    public void performService() {
        if (vehicle != null) {
            vehicle.service();
        } else {
            System.out.println("No vehicle to service");
        }
    }
}

