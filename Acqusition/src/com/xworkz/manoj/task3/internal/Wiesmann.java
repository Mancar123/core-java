package com.xworkz.manoj.task3.internal;

public class Wiesmann {
    private  String modelName;
    private int batteryCapacity;

    public  Wiesmann(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Wiesmann(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void artisanalCraftsmanship() {
        System.out.println("Wiesmann cars are handmade for luxury and performance.");
    }
}
