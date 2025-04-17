package com.xworkz.manoj.task3.internal;

public class Buick {
    private  String modelName;
    private int batteryCapacity;

    public  Buick(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Buick(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void luxuryComfort() {
        System.out.println("Buick offers a smooth and luxurious ride.");
    }

}
