package com.xworkz.manoj.task3.internal;

public class Datsun {
    private  String modelName;
    private int batteryCapacity;

    public  Datsun(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Datsun(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void budgetPerformance() {
        System.out.println("Datsun was known for affordable performance cars.");
    }
}
