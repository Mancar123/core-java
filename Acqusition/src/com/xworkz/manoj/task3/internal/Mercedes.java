package com.xworkz.manoj.task3.internal;

public class Mercedes {
    private  String modelName;
    private int batteryCapacity;

    public  Mercedes(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Mercedes(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void comfort() {
        System.out.println("Mercedes ensures maximum comfort.");
    }
}
