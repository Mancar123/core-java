package com.xworkz.manoj.task3.internal;

public class Ford {
    private  String modelName;
    private int batteryCapacity;

    public  Ford(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Ford(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void durability() {
        System.out.println("Ford cars are built tough.");
    }
}

