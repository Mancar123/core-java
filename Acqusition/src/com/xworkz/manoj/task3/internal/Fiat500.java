package com.xworkz.manoj.task3.internal;

public class Fiat500 {
    private  String modelName;
    private int batteryCapacity;

    public  Fiat500(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Fiat500(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void compactStyle() {
        System.out.println("Fiat 500 blends efficiency with style.");
    }
}
