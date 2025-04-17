package com.xworkz.manoj.task3.internal;

public class Lucid {
    private  String modelName;
    private int batteryCapacity;

    public  Lucid(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Lucid(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void innovation() {
        System.out.println("Lucid leads in EV innovation.");
    }
}
