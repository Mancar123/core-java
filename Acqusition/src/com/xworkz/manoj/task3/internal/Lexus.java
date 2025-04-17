package com.xworkz.manoj.task3.internal;

public class Lexus {
    private  String modelName;
    private int batteryCapacity;

    public  Lexus(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Lexus(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void comfort() {
        System.out.println("Lexus focuses on smooth driving comfort.");
    }

}
