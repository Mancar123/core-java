package com.xworkz.manoj.task3.internal;

public class Spyker {
    private  String modelName;
    private int batteryCapacity;

    public  Spyker(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Spyker(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void aviationInspiredDesign() {
        System.out.println("Spyker vehicles incorporate aviation-style engineering.");
    }
}
