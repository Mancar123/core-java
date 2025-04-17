package com.xworkz.manoj.task3.internal;

public class TVR {
    private  String modelName;
    private int batteryCapacity;

    public  TVR(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public TVR(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void rawDrivingExperience() {
        System.out.println("TVR offers lightweight sports cars with a raw feel.");
    }
}
