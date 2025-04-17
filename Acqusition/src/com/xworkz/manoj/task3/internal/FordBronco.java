package com.xworkz.manoj.task3.internal;

public class FordBronco {
    private  String modelName;
    private int batteryCapacity;

    public  FordBronco(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public FordBronco(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void outdoorCapabilities() {
        System.out.println("Bronco is designed for extreme adventures.");
    }
}
