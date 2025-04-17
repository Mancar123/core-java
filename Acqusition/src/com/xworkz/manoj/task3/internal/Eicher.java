package com.xworkz.manoj.task3.internal;

public class Eicher {
    private  String modelName;
    private int batteryCapacity;

    public  Eicher(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Eicher(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }

    public void commercialEfficiency() {
        System.out.println("Eicher produces high-performance trucks.");
    }
}
