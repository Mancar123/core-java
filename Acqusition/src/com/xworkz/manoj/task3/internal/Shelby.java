package com.xworkz.manoj.task3.internal;

public class Shelby {
    private  String modelName;
    private int batteryCapacity;

    public  Shelby(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Shelby(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }

    public void power() {
        System.out.println("Shelby vehicles provide extreme power.");
    }
}
