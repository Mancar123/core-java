package com.xworkz.manoj.task3.internal;

public class Pontiac {
    private  String modelName;
    private int batteryCapacity;

    public  Pontiac(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Pontiac(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void AmericanMuscle() {
        System.out.println("Pontiac is a classic American muscle car brand.");
    }

}
