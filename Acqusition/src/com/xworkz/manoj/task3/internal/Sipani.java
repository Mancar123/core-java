package com.xworkz.manoj.task3.internal;

public class Sipani {
    private  String modelName;
    private int batteryCapacity;

    public  Sipani(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Sipani(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void uniqueAutomotiveDesign() {
        System.out.println("Sipani produced innovative fiberglass vehicles.");
    }
}
