package com.xworkz.manoj.task3.internal;

public class Dodge {
    private  String modelName;
    private int batteryCapacity;

    public  Dodge(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Dodge(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void strength() {
        System.out.println("Dodge cars are built for power.");
    }

    public void sportMode() {
    }
}
