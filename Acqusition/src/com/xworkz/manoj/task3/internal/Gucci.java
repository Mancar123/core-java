package com.xworkz.manoj.task3.internal;

public class Gucci {
    private  String modelName;
    private int batteryCapacity;

    public  Gucci(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Gucci(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void luxury() {
        System.out.println("Gucci represents Italian luxury fashion.");
    }

}
