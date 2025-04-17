package com.xworkz.manoj.task3.internal;

public class Polestar {
    private  String modelName;
    private int batteryCapacity;

    public  Polestar(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Polestar(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void sustainability() {
        System.out.println("Polestar prioritizes EV sustainability.");
    }
}
