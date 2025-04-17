package com.xworkz.manoj.task3.internal;

public class Lightyear {
    private  String modelName;
    private int batteryCapacity;

    public  Lightyear(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Lightyear(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void solarPoweredEfficiency() {
        System.out.println("Lightyear creates vehicles with solar-assisted driving.");
    }
}
