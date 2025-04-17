package com.xworkz.manoj.task3.internal;

public class Maserati {
    private  String modelName;
    private int batteryCapacity;

    public  Maserati(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Maserati(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void performance() {
        System.out.println("Maserati combines speed with luxury.");
    }

    public void launchControl() {

    }
}
