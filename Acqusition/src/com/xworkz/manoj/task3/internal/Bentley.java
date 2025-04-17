package com.xworkz.manoj.task3.internal;

public class Bentley {
    private  String modelName;
    private int batteryCapacity;

    public  Bentley(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Bentley(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void luxuryDrive() {
        System.out.println("Bentley offers unmatched luxury.");
    }
}

