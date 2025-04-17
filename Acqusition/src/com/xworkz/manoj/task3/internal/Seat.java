package com.xworkz.manoj.task3.internal;

public class Seat {
    private  String modelName;
    private int batteryCapacity;

    public  Seat(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Seat(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void urbanMobility() {
        System.out.println("SEAT offers efficient urban mobility.");
    }

}
