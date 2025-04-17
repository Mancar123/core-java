package com.xworkz.manoj.task3.internal;

public class Chrysler {
    private  String modelName;
    private int batteryCapacity;

    public  Chrysler(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Chrysler(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void luxuryInnovation() {
        System.out.println("Chrysler balances luxury with modern innovation.");
    }

    public void fuelSaverMode() {
    }
}
