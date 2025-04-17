package com.xworkz.manoj.task3.internal;

public class GMC {
    private  String modelName;
    private int batteryCapacity;

    public  GMC(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public GMC(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void durability() {
        System.out.println("GMC vehicles are built tough.");
    }

}
