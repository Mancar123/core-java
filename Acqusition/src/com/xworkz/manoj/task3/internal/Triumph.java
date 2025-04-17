package com.xworkz.manoj.task3.internal;

public class Triumph {

    private  String modelName;
    private int batteryCapacity;

    public  Triumph(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Triumph(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void refinedPerformance() {
        System.out.println("Triumph motorcycles offer a balance of style and power.");
    }
}

