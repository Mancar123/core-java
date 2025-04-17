package com.xworkz.manoj.task3.internal;

public class ToyotaLandCruiser {
    private  String modelName;
    private int batteryCapacity;

    public  ToyotaLandCruiser(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public ToyotaLandCruiser(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void terrainMastery() {
        System.out.println("Land Cruiser dominates rugged terrain.");
    }

}
