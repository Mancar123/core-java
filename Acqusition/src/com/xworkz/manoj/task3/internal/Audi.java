package com.xworkz.manoj.task3.internal;

public class Audi {
    private  String modelName;
    private int batteryCapacity;

    public  Audi(){}

    public String toString() {
        System.out.println("running toString in class");
        return " Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Audi(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void quattro() {
        System.out.println("Audi provides Quattro all-wheel drive.");
    }
}

