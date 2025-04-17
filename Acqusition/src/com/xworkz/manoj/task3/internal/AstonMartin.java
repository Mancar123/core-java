package com.xworkz.manoj.task3.internal;

public class AstonMartin {
    private  String modelName;
    private int batteryCapacity;

    public  AstonMartin(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public AstonMartin(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void elegance() {
        System.out.println("Aston Martin exudes elegance and luxury.");
    }
}
