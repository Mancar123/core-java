package com.xworkz.manoj.task3.internal;

public class LandRover {
    private  String modelName;
    private int batteryCapacity;

    public  LandRover(){}

    public String toString() {
        System.out.println("running toString in class");
        return "Model: " + modelName + ", Battery Capacity: " + batteryCapacity + " kWh";
    }


    public LandRover(String modelName, int batteryCapacity) {
        this.modelName = modelName;
        this.batteryCapacity = batteryCapacity;

    }
    public void ruggedness() {
        System.out.println("Land Rover excels in rugged terrains.");
    }

}
