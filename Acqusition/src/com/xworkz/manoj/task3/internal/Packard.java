package com.xworkz.manoj.task3.internal;

public class Packard {
    private  String modelName;
    private int batteryCapacity;

    public  Packard(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Packard(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void historicLuxury() {
        System.out.println("Packard was a hallmark of American luxury.");
    }
}
