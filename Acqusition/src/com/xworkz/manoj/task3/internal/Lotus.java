package com.xworkz.manoj.task3.internal;

public class Lotus {
    private  String modelName;
    private int batteryCapacity;

    public  Lotus(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Lotus(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void aerodynamics() {
        System.out.println("Lotus cars focus on lightweight aerodynamics.");
    }

}
