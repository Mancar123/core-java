package com.xworkz.manoj.task3.internal;

public class Panhard {
    private  String modelName;
    private int batteryCapacity;

    public  Panhard(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public Panhard(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void vintageAutomotiveEngineering() {
        System.out.println("Panhard pioneered early automobile engineering.");
    }

    public void streamlinedBody() {

    }
}
