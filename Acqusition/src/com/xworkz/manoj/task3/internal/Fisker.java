package com.xworkz.manoj.task3.internal;

public class Fisker {
    private  String modelName;
    private int batteryCapacity;

    public  Fisker(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Aptera Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Fisker(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void futureMobility() {
        System.out.println("Fisker leads with innovative EV design.");
    }
}
