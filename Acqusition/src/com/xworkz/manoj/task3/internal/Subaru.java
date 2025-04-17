package com.xworkz.manoj.task3.internal;

public class Subaru {
    private  String modelName;
    private int batteryCapacity;

    public  Subaru(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Subaru(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void awdTechnology() {
        System.out.println("Subaru excels in all-wheel-drive technology.");
    }

}
