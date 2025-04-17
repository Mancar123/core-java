package com.xworkz.manoj.task3.internal;

public class Saab {

    private  String modelName;
    private int batteryCapacity;

    public  Saab(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Saab(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void safetyInnovation() {
        System.out.println("Saab focuses on safety and reliability.");
    }
}
