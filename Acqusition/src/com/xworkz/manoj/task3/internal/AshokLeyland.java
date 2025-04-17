package com.xworkz.manoj.task3.internal;

public class AshokLeyland {
    private  String modelName;
    private int batteryCapacity;

    public  AshokLeyland(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public AshokLeyland(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void commercialStrength() {
        System.out.println("Ashok Leyland leads in commercial transportation.");
    }
}
